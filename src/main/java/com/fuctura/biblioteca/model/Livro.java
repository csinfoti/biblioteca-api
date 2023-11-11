package com.fuctura.biblioteca.model;

public class Livro {



    private int id;
    private String titulo, nome_autor, resumo;
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Livro(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", nome_autor='" + nome_autor + '\'' +
                ", resumo='" + resumo + '\'' +
                ", categoria=" + categoria +
                '}';
    }

    public Livro(int id, String titulo, String nome_autor, String resumo) {
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.resumo = resumo;
    }

   public Livro() {
        super();
   }
}
