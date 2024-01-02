/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final.Clases;

/**
 *
 * @author GIGABYTE
 */
public class frases {
    
    String autor,texto,cod_frases,categoria;

    public frases() {
    }

    public frases(String autor, String texto, String cod_frases, String categoria) {
        this.autor = autor;
        this.texto = texto;
        this.cod_frases = cod_frases;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCod_frases() {
        return cod_frases;
    }

    public void setCod_frases(String cod_frases) {
        this.cod_frases = cod_frases;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "frases{" + "autor=" + autor + ", texto=" + texto + ", cod_frases=" + cod_frases + ", categoria=" + categoria + '}';
    }
    
    
    
    
}
