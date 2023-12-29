
package proyecto_final;

public class Validaciones {
    
    
    private String caracteres;
    private int enteros;
    private Double decimales;

    public Validaciones() {
    }

    public Validaciones(String caracteres, int enteros, Double decimales) {
        this.caracteres = caracteres;
        this.enteros = enteros;
        this.decimales = decimales;
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    public int getEnteros() {
        return enteros;
    }

    public void setEnteros(int enteros) {
        this.enteros = enteros;
    }

    public Double getDecimales() {
        return decimales;
    }

    public void setDecimales(Double decimales) {
        this.decimales = decimales;
    }

    @Override
    public String toString() {
        return "Validaciones{" + "caracteres=" + caracteres + ", enteros=" + enteros + ", decimales=" + decimales + '}';
    }
    
    boolean ValidarUusario(String caracteres) {
if (caracteres.matches("^[a-zA-Z0-9!@#$%^&*()_+{}|;:'\\\",.<>?/\\\\\\\\-]{1,20}$")) {
            return true;
        } else {
            return false;
        }
    }
    boolean ValidarContraseña(String caracteres){
        if (caracteres.matches("^[a-zA-Z0-9!@#$%^&*()_+{}|;:'\\\",.<>?/\\\\\\\\-]{1,8}")) {
            return true;
        }else{
            return false;
            
        }
    }
}
