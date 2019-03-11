package com.example.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.postagem_detalhe, viewGroup, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {

        Postagem postagem = postagens.get(i);

        myViewHolder.autorTextView.setText(postagem.getNome());
        myViewHolder.mensagemPostagemTextView.setText(postagem.getPostagem());
        myViewHolder.fotoPostagemImageView.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder {

        private TextView autorTextView;
        private TextView mensagemPostagemTextView;
        private ImageView fotoPostagemImageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            autorTextView = itemView.findViewById(R.id.autorTextView);
            fotoPostagemImageView = itemView.findViewById(R.id.fotoPostagemImageView);
            mensagemPostagemTextView = itemView.findViewById(R.id.mensagemPostagemTextView);
        }
    }

}
