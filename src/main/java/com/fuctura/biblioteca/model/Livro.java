package com.fuctura.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fuctura.biblioteca.enums.Tamanho;

import javax.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo, nome_autor, texto;
    private Tamanho tamanho;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


    public Livro() {
    }

    public Livro(Integer id, String titulo, String nome_autor, String texto, Tamanho tamanho, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
        this.tamanho = tamanho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
}
