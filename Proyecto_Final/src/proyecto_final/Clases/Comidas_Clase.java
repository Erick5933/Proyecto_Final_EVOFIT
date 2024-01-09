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
public class Comidas_Clase {

    private String Codigo;
    private String Nombre;
    private String Tipo;
    private double Cantidad_Proteico;
    private double Cantidad_Carbodidratos;
    private double Cantidad_Calorías;
    private int Tamaño_Porción;

    public Comidas_Clase() {
    }

    public Comidas_Clase(String Codigo, String Nombre, String Tipo, double Cantidad_Proteico, double Cantidad_Carbodidratos, double Cantidad_Calorías, int Tamaño_Porción) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Cantidad_Proteico = Cantidad_Proteico;
        this.Cantidad_Carbodidratos = Cantidad_Carbodidratos;
        this.Cantidad_Calorías = Cantidad_Calorías;
        this.Tamaño_Porción = Tamaño_Porción;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getCantidad_Proteico() {
        return Cantidad_Proteico;
    }

    public void setCantidad_Proteico(double Cantidad_Proteico) {
        this.Cantidad_Proteico = Cantidad_Proteico;
    }

    public double getCantidad_Carbodidratos() {
        return Cantidad_Carbodidratos;
    }

    public void setCantidad_Carbodidratos(double Cantidad_Carbodidratos) {
        this.Cantidad_Carbodidratos = Cantidad_Carbodidratos;
    }

    public double getCantidad_Calorías() {
        return Cantidad_Calorías;
    }

    public void setCantidad_Calorías(double Cantidad_Calorías) {
        this.Cantidad_Calorías = Cantidad_Calorías;
    }

    public int getTamaño_Porción() {
        return Tamaño_Porción;
    }

    public void setTamaño_Porción(int Tamaño_Porción) {
        this.Tamaño_Porción = Tamaño_Porción;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    @Override
    public String toString() {
        return "Comidas_Clase{" + "Nombre=" + Nombre + ", Tipo=" + Tipo + ", Cantidad_Proteico=" + Cantidad_Proteico + ", Cantidad_Carbodidratos=" + ", Cantidad_Calor\u00edas=" + Cantidad_Calorías + ", Tama\u00f1o_Porci\u00f3n=" + Tamaño_Porción + '}';
    }

}
