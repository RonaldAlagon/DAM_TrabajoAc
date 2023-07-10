package com.example.dam_ta;

public class Nota {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private String contenido;

    public Nota(String titulo, String contenido, boolean favorito, int color) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.favorito = favorito;
        this.color = color;
    }

    public Nota() {
    }

    private boolean favorito;
    private int color;


}
