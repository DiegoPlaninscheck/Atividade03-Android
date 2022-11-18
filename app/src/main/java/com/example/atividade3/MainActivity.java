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
        System.out.println("criou");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        lista = new ArrayList<>();
        botaoAdd = findViewById(R.id.botaoMais);

        setListagemInfo();
        setAdapter();

        System.out.println(lista.toString());

        botaoAdd.setOnClickListener(v -> telaAddLivro());
        System.out.println("fim criou");
    }

    private void telaAddLivro() {
        System.out.println("tela add livro");
        Intent intent = new Intent(this, CadastroLivro.class);
        startActivity(intent);
    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(lista);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

//    public static void atualizarLista(ArrayList<Livro> novaLista){
//        lista = novaLista;
//    }

    private void setListagemInfo() {
        lista.add(new Livro(123, "Livro 1", "Sinopse", "Editora", "2022", "foto"));
    }
}