package com.example.atividade3;


public class Livro {
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
}
