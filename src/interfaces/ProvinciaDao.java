package interfaces;

import java.util.List;

import modelo.Distrito;
import modelo.Provincia;

public interface ProvinciaDao {

	public List listarProvincia();

    public Distrito buscarProvincia(int id);

    public boolean agregarProvinvia(Provincia provincia);

    public boolean editarProvincia(Provincia provincia);

    public boolean eliminarProvincia(int id);
}
