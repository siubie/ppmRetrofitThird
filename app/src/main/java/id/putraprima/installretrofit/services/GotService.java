package id.putraprima.installretrofit.services;

import java.util.List;

import id.putraprima.installretrofit.models.Book;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by putraprima on 04/11/17.
 */

public interface GotService {
    @GET("books")
    Call<List<Book>> getBooks();
}
