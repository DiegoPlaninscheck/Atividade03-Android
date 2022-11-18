package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Livro> lista;
    private RecyclerView recyclerView;
    private ImageButton botaoAdd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        lista = new ArrayList<>();
        botaoAdd = findViewById(R.id.botaoMais);

        setListagemInfo();
        setAdapter();

        Intent intent = getIntent();

        String livroIsbn = intent.getStringExtra("isbn");
        String livroNome = intent.getStringExtra("nome");
        String livroSinopse = intent.getStringExtra("sinopse");
        String livroEditora = intent.getStringExtra("editora");
        String livroAno = intent.getStringExtra("ano");

        if (livroIsbn != null && livroNome != null && livroSinopse != null && livroEditora != null && livroAno != null) {
            Livro livro = new Livro(Integer.parseInt(livroIsbn), livroNome, livroSinopse, livroEditora, livroAno);
            lista.add(livro);
        }

        botaoAdd.setOnClickListener(v -> telaAddLivro());
    }

    private void telaAddLivro() {
        System.out.println("tela add livro");
        Intent intent = new Intent(this, CadastroLivro.class);
        intent.putExtra("lista", lista);
        startActivity(intent);
    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(lista);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setListagemInfo() {
        lista.add(new Livro(123, "Livro 1", "Sinopse", "Editora", "2022", "foto"));
    }
}