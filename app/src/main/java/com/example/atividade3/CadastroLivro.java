package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class CadastroLivro extends AppCompatActivity {

    private ImageView iconeVoltar;
    private Button botaoCadastrar;

    private EditText isbn;
    private EditText nome;
    private EditText sinopse;
    private EditText editora;
    private EditText ano;
    private ImageButton foto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_livro);

        iconeVoltar = findViewById(R.id.iconVoltar);
        botaoCadastrar = findViewById(R.id.botaoCadastrar);

        isbn = findViewById(R.id.isbn);
        nome = findViewById(R.id.nome);
        sinopse = findViewById(R.id.sinopse);
        editora = findViewById(R.id.editora);
        ano = findViewById(R.id.ano);
        foto = findViewById(R.id.imagemButtonFoto);

        iconeVoltar.setOnClickListener(v -> voltar());
        botaoCadastrar.setOnClickListener(v -> cadastrarLivro());
    }

    private void cadastrarLivro() {
        Livro livro = new Livro(Integer.parseInt(isbn.getText().toString()), nome.getText().toString(), sinopse.getText().toString(), editora.getText().toString(), ano.getText().toString());
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("isbn", livro.getIsbn().toString());
        intent.putExtra("nome", livro.getNome());
        intent.putExtra("sinopse", livro.getSinopse());
        intent.putExtra("editora", livro.getEditora());
        intent.putExtra("ano", livro.getAno());
        startActivity(intent);
    }

    private void voltar() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}