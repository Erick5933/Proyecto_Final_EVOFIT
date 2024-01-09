/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final.Clases;

import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

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

    public Clase_Registrarse(JTextField Nombre, JTextField Apellido, JTextField Usuario, JSpinner Edad, JRadioButton Masculino, JRadioButton Femenino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public static double calcularRequerimientoCalorico(double peso, double altura, int edad, String genero, String Actividad) {
    double factorActividad = Double.parseDouble(Actividad);
    double requerimientoCalorico;

    if (genero.equals("Femenino")) {
            requerimientoCalorico = (66 + (13.7 * peso)) + ((5 * altura) - (6.8 * edad)) * factorActividad - 200;
    } else { // asumimos que el género es "Masculino"
            requerimientoCalorico = (66 + (13.7 * peso)) + ((5 * altura) - (6.8 * edad)) * factorActividad - 200;
    }

    return requerimientoCalorico;
}

    public static double calcularCaloriasBajarPeso(double requerimientoCalorico) {
        // Ajusta según tus necesidades y objetivos
        return Math.round(requerimientoCalorico - 500);
    }

    public static double calcularCaloriasGanarMusculo(double requerimientoCalorico) {
        // Ajusta según tus necesidades y objetivos
        return Math.round(requerimientoCalorico + 300);
    }

    public static double calcularCaloriasSubirPeso(double requerimientoCalorico) {
        // Ajusta según tus necesidades y objetivos
        return Math.round(requerimientoCalorico + 500);
    }

    public static double calcularCaloriasPerderGrasa(double requerimientoCalorico) {
        // Ajusta según tus necesidades y objetivos
        return Math.round(requerimientoCalorico - 300);
    }

    // Mantener peso
    public static double calcularCaloriasMantenerPeso(double requerimientoCalorico) {
        // Ajusta según tus necesidades y objetivos
        return Math.round(requerimientoCalorico);
    }

    
   public static Clase_Registrarse obtenerInstanciaDeUsuario() {
    Clase_Registrarse nuevoRegistro = new Clase_Registrarse();

    // Aquí asigna los valores necesarios a las propiedades de nuevoRegistro
    nuevoRegistro.setPeso(70);  // Reemplaza con el valor correcto
    nuevoRegistro.setAltura(175);  // Reemplaza con el valor correcto
    nuevoRegistro.setEdad(25);  // Reemplaza con el valor correcto
    nuevoRegistro.setGenero("Femenino");  // Reemplaza con el valor correcto
    nuevoRegistro.setActividad("1.725");  // Reemplaza con el valor correcto

    return nuevoRegistro;
}

  

    
}
