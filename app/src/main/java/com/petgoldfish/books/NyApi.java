package com.petgoldfish.books;

import com.petgoldfish.books.BooksModels.BooksModel;
import com.petgoldfish.books.BooksModels.Lists;
import com.petgoldfish.books.ListsModels.EachList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NyApi {

    @GET(Utils.booksApiOverviewUrl + Utils.booksApiKey)
    Call<BooksModel> getBooksOverview();

    @GET(Utils.listsApiUrl)
    Call<EachList> getListOfBooks(@Query("list-name") String lsName, @Query("api-key") String apiKey);

}
