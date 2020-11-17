package modelo;

<<<<<<< HEAD
public class Distrito {
    private int iddistrito;
    private String nombre_distrito;
    private int poblacion;
    private int idprovincia;
=======

public class Distrito {
    private int iddistrito;
    private String nombre_distrito;
    private String poblacion;
>>>>>>> d145b09c2df877b63a1bfbfac3cc30f29d7a0513

    public Distrito() {
    }

<<<<<<< HEAD
    public Distrito(int iddistrito, String nombre_distrito, int poblacion, int idprovincia) {
        this.iddistrito = iddistrito;
        this.nombre_distrito = nombre_distrito;
        this.poblacion = poblacion;
        this.idprovincia = idprovincia;
=======
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
>>>>>>> d145b09c2df877b63a1bfbfac3cc30f29d7a0513
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
<<<<<<< HEAD

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
=======
>>>>>>> d145b09c2df877b63a1bfbfac3cc30f29d7a0513
    
    
}
