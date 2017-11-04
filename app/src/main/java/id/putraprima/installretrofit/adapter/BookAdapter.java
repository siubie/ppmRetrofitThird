package id.putraprima.installretrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import id.putraprima.installretrofit.R;
import id.putraprima.installretrofit.models.Book;

/**
 * Created by putraprima on 04/11/17.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{
    Context ctx;
    List<Book> bookList;

    public BookAdapter(Context ctx, List<Book> bookList) {
        this.ctx = ctx;
        this.bookList = bookList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
        BookViewHolder vh = new BookViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        Book itemBuku = bookList.get(position);
        holder.txtName.setText(itemBuku.getName());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        public TextView txtName;
        public BookViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}

