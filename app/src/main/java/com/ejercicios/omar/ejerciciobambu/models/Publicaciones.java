package com.ejercicios.omar.ejerciciobambu.models;

/**
 * Created by Dagorik on 20/04/2017.
 */

public class Publicaciones {

    int imgPerfil;
    String nombre;
    String fecha;
    String contenido;
    int favoritos;
    String comentarios;

    public Publicaciones(int imgPerfil, String nombre, String fecha, String contenido, int favoritos, String comentarios) {
        this.imgPerfil = imgPerfil;
        this.nombre = nombre;
        this.fecha = fecha;
        this.contenido = contenido;
        this.favoritos = favoritos;
        this.comentarios = comentarios;
    }

    public int getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(int imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(int favoritos) {
        this.favoritos = favoritos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "imgPerfil=" + imgPerfil +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", contenido='" + contenido + '\'' +
                ", favoritos=" + favoritos +
                ", comentarios=" + comentarios +
                '}';
    }
}
