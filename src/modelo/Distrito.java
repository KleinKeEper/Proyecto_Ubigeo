package modelo;

public class Distrito {

    private int iddistrito;
    private String nombre_distrito;
    private int poblacion;
    private int idprovincia;

    public Distrito() {
    }

    public Distrito(int iddistrito, String nombre_distrito, int poblacion, int idprovincia) {
        this.iddistrito = iddistrito;
        this.nombre_distrito = nombre_distrito;
        this.poblacion = poblacion;
        this.idprovincia = idprovincia;
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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

}
