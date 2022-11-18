package com.example.atividade3;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Livro implements Parcelable {
    private Integer isbn;
    private String nome, sinopse, editora, ano, foto;

    public Livro(Integer isbn, String nome, String sinopse, String editora, String ano, String foto) {
        this.isbn = isbn;
        this.nome = nome;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.foto = foto;
    }

    public Livro(Integer isbn, String nome, String sinopse, String editora, String ano) {
        this.isbn = isbn;
        this.nome = nome;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
    }

    protected Livro(Parcel in) {
        if (in.readByte() == 0) {
            isbn = null;
        } else {
            isbn = in.readInt();
        }
        nome = in.readString();
        sinopse = in.readString();
        editora = in.readString();
        ano = in.readString();
        foto = in.readString();
    }

    public static final Creator<Livro> CREATOR = new Creator<Livro>() {
        @Override
        public Livro createFromParcel(Parcel in) {
            return new Livro(in);
        }

        @Override
        public Livro[] newArray(int size) {
            return new Livro[size];
        }
    };

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", editora='" + editora + '\'' +
                ", ano='" + ano + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        if (isbn == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(isbn);
        }
        dest.writeString(nome);
        dest.writeString(sinopse);
        dest.writeString(editora);
        dest.writeString(ano);
        dest.writeString(foto);
    }
}
