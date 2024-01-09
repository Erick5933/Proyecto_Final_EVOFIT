/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final.Clases;

/**
 *
 * @author Erick
 */
public class Comidas {
    
    private String nombre;
    private  double calorias;
    private double proteina;
    private double grasas;
    private double carbohidratos;

    public Comidas() {
        super();    
    }

    
    
    public Comidas(String nombre, double calorias, double proteina, double grasas, double carbohidratos) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.proteina = proteina;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getProteina() {
        return proteina;
    }

    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }
   
    
    
    
    
}
