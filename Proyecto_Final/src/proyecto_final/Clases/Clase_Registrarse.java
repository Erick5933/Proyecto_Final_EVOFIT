/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final.Clases;

/**
 *
 * @author Wendy LLivichuzhca
 */
public class Clase_Registrarse {

    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Contraseña;
    private int Edad;
    private double Peso;
    private double Altura;
    private String Actividad;
    private String Genero;

    public Clase_Registrarse() {
    }

    public Clase_Registrarse(String Nombre, String Apellido, String Usuario, String Contraseña, int Edad, double Peso, double Altura, String Actividad, String Genero) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Actividad = Actividad;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    
    
}
