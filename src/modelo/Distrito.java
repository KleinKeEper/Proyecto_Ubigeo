package modelo;


public class Distrito {
    private int iddistrito;
    private String nombre_distrito;
    private String poblacion;

    public Distrito() {
    }

    public Distrito(int iddistrito, String nombre_distrito, String poblacion) {
        this.iddistrito = iddistrito;
        this.nombre_distrito = nombre_distrito;
        this.poblacion = poblacion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public String getNombre_distrito() {
        return nombre_distrito;
    }

    public void setNombre_distrito(String nombre_distrito) {
        this.nombre_distrito = nombre_distrito;
    }
    
    
}
