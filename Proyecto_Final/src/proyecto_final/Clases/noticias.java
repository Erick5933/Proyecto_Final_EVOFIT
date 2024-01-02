/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final.Clases;

import java.util.Date;

/**
 *
 * @author GIGABYTE
 */
public class noticias {
    String cod_not,descripcion,titulo,contenido,categoria,web,autor;
    Date fechapu;

    public noticias() {
    }

    public noticias(String cod_not, String descripcion, String titulo, String contenido, String categoria, String web, String autor, Date fechapu) {
        this.cod_not = cod_not;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.categoria = categoria;
        this.web = web;
        this.autor = autor;
        this.fechapu = fechapu;
    }

    public String getCod_not() {
        return cod_not;
    }

    public void setCod_not(String cod_not) {
        this.cod_not = cod_not;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechapu() {
        return fechapu;
    }

    public void setFechapu(Date fechapu) {
        this.fechapu = fechapu;
    }

    @Override
    public String toString() {
        return "noticias{" + "cod_not=" + cod_not + ", descripcion=" + descripcion + ", titulo=" + titulo + ", contenido=" + contenido + ", categoria=" + categoria + ", web=" + web + ", autor=" + autor + ", fechapu=" + fechapu + '}';
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
