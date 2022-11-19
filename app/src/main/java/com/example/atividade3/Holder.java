package com.example.atividade3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    private ImageView imagem;
    private View item;
    private TextView nomeLivro;
    private ImageView delete;


    public Holder(View view) {
        super(view);
        imagem = view.findViewById(R.id.foto);
        item = view.findViewById(R.id.item);
        nomeLivro = view.findViewById(R.id.nomeLivro);
        delete = view.findViewById(R.id.iconeExcluir);
    }

    public TextView getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(TextView nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public View getItem() {
        return item;
    }

    public void setItem(View item) {
        this.item = item;
    }

    public ImageView getDelete() {
        return delete;
    }

    public void setDelete(ImageView delete) {
        this.delete = delete;
    }
}
