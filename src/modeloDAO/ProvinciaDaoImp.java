package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import interfaces.ProvinciaDao;
import modelo.Departamento;
import modelo.Distrito;
import modelo.Provincia;

public class ProvinciaDaoImp implements ProvinciaDao{

	ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Provincia provincia = new Provincia();
	
	@Override
	public List listarProvincia() {
		// TODO Auto-generated method stub
		ArrayList<Provincia> provincias = new ArrayList<>();
        String consulta = " select * from provincia";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Provincia provincia = new Provincia();
                provincia.setIdprovincia(rs.getInt("idprovincia"));
                provincia.setNombre_provincia(rs.getString("nombre_provincia"));
                provincia.setIddepartamento(rs.getInt("iddepartamento"));
                provincias.add(provincia);
            }
        } catch (Exception e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return provincias;
		
	}

	@Override
	public Distrito buscarProvincia(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarProvinvia(Provincia provincia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editarProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarProvincia(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
