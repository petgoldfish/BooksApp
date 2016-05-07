package com.petgoldfish.books;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.petgoldfish.books.BooksModels.Books;
import com.petgoldfish.books.BooksModels.BooksModel;
import com.petgoldfish.books.BooksModels.Lists;
import com.petgoldfish.books.BooksModels.Results;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BestSellersFragment extends Fragment {

    BooksModel booksModel;
    Results rs;
    Lists ls[];

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.best_sellers_layout, container, false);

        final RecyclerView mainRv = (RecyclerView) rootView.findViewById(R.id.mainRv);
        mainRv.setLayoutManager(new GridLayoutManager(getContext(), 2));

        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setTitle("Fetching Data");
        progressDialog.setMessage("Please Wait");
        progressDialog.show();

        final TextView numResults = (TextView) rootView.findViewById(R.id.num_results);
        final TextView bestSellersDate = (TextView) rootView.findViewById(R.id.best_sellers_date);
        final TextView publishedDate = (TextView) rootView.findViewById(R.id.published_date);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Utils.booksBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NyApi api = retrofit.create(NyApi.class);
        final Call<BooksModel> booksCall = api.getBooksOverview();
        booksCall.enqueue(new Callback<BooksModel>() {
            @Override
            public void onResponse(Call<BooksModel> call, Response<BooksModel> response) {
                booksModel = response.body();
                rs = booksModel.getResults();
                ls = booksModel.getResults().getLists();
                Books bs[] = ls[0].getBooks();
                String bslist = "";
                for (Books b : bs) {
                    bslist = bslist + b.getTitle() + " ";
                }

                numResults.setText("Number of results - " + booksModel.getNum_results());
                bestSellersDate.setText("Best Sellers Date - " + rs.getBestsellers_date());
                publishedDate.setText("Published Date - " + rs.getPublished_date());

                mainRVAdapter adapter = new mainRVAdapter(ls);
                mainRv.setAdapter(adapter);

                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<BooksModel> call, Throwable t) {
                t.printStackTrace();
            }
        });


        return rootView;
    }

    public class mainRVAdapter extends RecyclerView.Adapter<mainRVAdapter.MyViewHolder> {

        Lists ls[];

        mainRVAdapter(Lists ls[]) {
            this.ls = ls;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_rv_layout, parent, false);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, int position) {
            holder.test.setText(ls[position].getDisplay_name());
            holder.inRv.setAdapter(new inRVAdapter(ls[position].getBooks()));
            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), DetailActivity.class);
                    intent.putExtra("DetailActivity", ls[holder.getAdapterPosition()].getList_name_encoded());
                    intent.putExtra("BooksModel", new Gson().toJson(booksModel));
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return ls.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView test;
            RecyclerView inRv;
            LinearLayout linearLayout;

            MyViewHolder(View itemView) {
                super(itemView);

                test = (TextView) itemView.findViewById(R.id.list_title);
                inRv = (RecyclerView) itemView.findViewById(R.id.innerRv);
                linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
                inRv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
                inRv.setAdapter(new inRVAdapter());
            }

        }

    }

    public class inRVAdapter extends RecyclerView.Adapter<inRVAdapter.MyViewHolder> {

        Books bs[];

        inRVAdapter() {

        }

        inRVAdapter(Books bs[]) {
            this.bs = bs;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.in_rv_layout, parent, false);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.test.setText(bs[position].getTitle());
            Picasso.with(getContext()).load(bs[position].getBook_image()).into(holder.thumb);
        }

        @Override
        public int getItemCount() {
            return bs.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView test;
            ImageView thumb;

            MyViewHolder(View itemView) {
                super(itemView);

                test = (TextView) itemView.findViewById(R.id.book_title);
                thumb = (ImageView) itemView.findViewById(R.id.thumb);

            }

        }

    }

}
