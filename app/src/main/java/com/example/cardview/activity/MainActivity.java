package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView postagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postagem = findViewById(R.id.postagemRecyclerView);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        postagem.setLayoutManager(layoutManager);

        //define adapter
        PostagemAdapter postagemAdapter = new PostagemAdapter();
        postagem.setAdapter(postagemAdapter);
    }
}
