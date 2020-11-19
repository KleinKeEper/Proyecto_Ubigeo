package modelo;

public class Provincia {
	private int idprovincia;
	private String nombre_provincia;
	private int iddepartamento;
	
	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Provincia(int idprovincia, String nombre_provincia, int iddepartamento) {
		super();
		this.idprovincia = idprovincia;
		this.nombre_provincia = nombre_provincia;
		this.iddepartamento = iddepartamento;
	}
	public int getIdprovincia() {
		return idprovincia;
	}
	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}
	public String getNombre_provincia() {
		return nombre_provincia;
	}
	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}
	public int getIddepartamento() {
		return iddepartamento;
	}
	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	
	
	
	
}
