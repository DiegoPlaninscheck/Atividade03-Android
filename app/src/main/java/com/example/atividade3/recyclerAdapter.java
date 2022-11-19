package com.example.atividade3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {

    private ArrayList<Livro> lista;
    private Holder holder;

    public recyclerAdapter(ArrayList<Livro> lista) {
        this.lista = lista;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView foto;
        private ImageView excluirItem;
        private TextView nomeLivro;
        private View item;

        public MyViewHolder(final View view) {
            super(view);
            foto = view.findViewById(R.id.foto);
            excluirItem = view.findViewById(R.id.iconeExcluir);
            nomeLivro = view.findViewById(R.id.nomeLivro);
            item = view.findViewById(R.id.item);
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Holder myHolder = (Holder) holder;
//        String nome = lista.get(position).getNome();
//        holder.nomeLivro.setText(nome);

//        myHolder.getImagem().setImageResource(lista.get(position).getFoto());
        myHolder.getNomeLivro().setText(lista.get(position).getNome());

        myHolder.getItem().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
