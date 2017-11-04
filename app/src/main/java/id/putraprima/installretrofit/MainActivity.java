package id.putraprima.installretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.putraprima.installretrofit.adapter.BookAdapter;
import id.putraprima.installretrofit.generator.ServiceGenerator;
import id.putraprima.installretrofit.models.Book;
import id.putraprima.installretrofit.services.GotService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    GotService gotService;
    Button btnReload;
    RecyclerView rvBook;
    BookAdapter mBookAdapter;
    List<Book> mBookList = new ArrayList<>();
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotService = ServiceGenerator.createService(GotService.class);
        reloadData();
        mBookAdapter = new BookAdapter(getApplicationContext(),mBookList);
        mLayoutManager = new LinearLayoutManager(this);
        rvBook = (RecyclerView) findViewById(R.id.rvBook);
        rvBook.setLayoutManager(mLayoutManager);
        rvBook.setAdapter(mBookAdapter);

        btnReload = (Button) findViewById(R.id.btnReload);
        btnReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               reloadData();
            }
        });
    }

    private void reloadData() {
        Call<List<Book>> call = gotService.getBooks();
        call.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                Log.d("SOKO","SUKSES");
                mBookList.clear();
                mBookList.addAll(response.body());
                mBookAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Book>> call, Throwable t) {
                Log.d("SOKO","Gagal");
            }
        });
    }
}
