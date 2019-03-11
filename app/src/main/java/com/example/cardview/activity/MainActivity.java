package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView postagem;
    private List<Postagem> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postagem = findViewById(R.id.postagemRecyclerView);

        //define layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        postagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();
        PostagemAdapter postagemAdapter = new PostagemAdapter(postagens);
        postagem.setAdapter(postagemAdapter);
    }

    private void prepararPostagens()
    {
        postagens = new ArrayList<Postagem>();
        postagens.add(new Postagem("Philipe Cunha", "#tbt Viagem legal!", R.drawable.imagem1));
        postagens.add(new Postagem("Hotel JM", "Viaje, aproveite nossos descontos!", R.drawable.imagem2));
        postagens.add(new Postagem("Maria Luiza", "#Paris!!", R.drawable.imagem3));
        postagens.add(new Postagem("Marcos Paulo", "Que foto linda!", R.drawable.imagem4));
    }
}
