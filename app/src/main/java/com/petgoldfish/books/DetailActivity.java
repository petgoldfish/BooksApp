package com.petgoldfish.books;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.petgoldfish.books.BooksModels.BooksModel;
import com.petgoldfish.books.ListsModels.EachList;
import com.petgoldfish.books.ListsModels.Results;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Fetching Data");
        progressDialog.setMessage("Please Wait");
        progressDialog.show();

        final RecyclerView detailRv = (RecyclerView) findViewById(R.id.detailRv);
        detailRv.setLayoutManager(new LinearLayoutManager(this));

        String lsName = getIntent().getStringExtra("DetailActivity");
        BooksModel booksModel = new Gson().fromJson(getIntent().getStringExtra("BooksModel"), BooksModel.class);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Utils.booksBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NyApi api = retrofit.create(NyApi.class);
        final Call<EachList> listsCall = api.getListOfBooks(lsName, Utils.booksApiKey);
        listsCall.enqueue(new Callback<EachList>() {
            @Override
            public void onResponse(Call<EachList> call, Response<EachList> response) {
                progressDialog.dismiss();

                EachList els = response.body();
                Results rs[] = els.getResults();
                detailRv.setAdapter(new detailRVAdapter(rs));
            }

            @Override
            public void onFailure(Call<EachList> call, Throwable t) {
                t.printStackTrace();
            }
        });

        final TextView bestSellersDate = (TextView) findViewById(R.id.best_sellers_date);
        final TextView publishedDate = (TextView) findViewById(R.id.published_date);


        bestSellersDate.setText("Best Sellers Date - " + booksModel.getResults().getBestsellers_date());
        publishedDate.setText("Published Date - " + booksModel.getResults().getPublished_date());


    }

    public class detailRVAdapter extends RecyclerView.Adapter<detailRVAdapter.MyViewHolder> {

        Results bs[];

        detailRVAdapter() {

        }

        detailRVAdapter(Results bs[]) {
            this.bs = bs;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_rv_layout, parent, false);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.title.setText(bs[position].getBook_details()[0].getTitle());
            holder.author.setText("Author - " + bs[position].getBook_details()[0].getAuthor());
            holder.description.setText("Description - " + bs[position].getBook_details()[0].getDescription());
            holder.publisher.setText("Publisher - " + bs[position].getBook_details()[0].getPublisher());
            holder.contributor.setText("Contributor - " + bs[position].getBook_details()[0].getContributor());
            holder.link.setText("Link - " + bs[position].getAmazon_product_url());
            //Picasso.with(DetailActivity.this).load(bs[position].getBook_image()).into(holder.thumb);
        }

        @Override
        public int getItemCount() {
            return bs.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView title, author, contributor, publisher, description, link;
            ImageView thumb;

            MyViewHolder(View itemView) {
                super(itemView);

                title = (TextView) itemView.findViewById(R.id.book_title);
                author = (TextView) itemView.findViewById(R.id.book_author);
                contributor = (TextView) itemView.findViewById(R.id.book_contributor);
                publisher = (TextView) itemView.findViewById(R.id.book_publisher);
                description = (TextView) itemView.findViewById(R.id.book_description);
                link = (TextView) itemView.findViewById(R.id.book_link);

                thumb = (ImageView) itemView.findViewById(R.id.thumb);

            }

        }

    }
}
