package modelo;
//Autor: Paulo Huaman
public class Departamento {

    private int iddepartamento;
    private String nombre_departamento;

    public Departamento() {
    }

    public Departamento(int iddepartamento, String nombre_departamento) {
        this.iddepartamento = iddepartamento;
        this.nombre_departamento = nombre_departamento;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

}
