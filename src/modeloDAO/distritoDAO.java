package modeloDAO;

import interfaces.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import modelo.Distrito;
import modelo.Provincia;

public class distritoDAO implements CRUD {

	ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Distrito distrito = new Distrito();
	
    @Override
    public List listardistritos() {
    	ArrayList<Distrito> distritos = new ArrayList<>();
        String consulta = " select * from distrito";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Distrito distrito = new Distrito();
                distrito.setIddistrito(rs.getInt("iddistrito"));
                distrito.setNombre_distrito(rs.getString("nombre_distrito"));
                distrito.setPoblacion(rs.getInt("poblacion"));
                distrito.setIdprovincia(rs.getInt("idprovincia"));
                distritos.add(distrito);
            }
        } catch (Exception e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return distritos;
    	
    	
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Distrito buscardistrito(int distrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregardistrito(Distrito distito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editardistrito(Distrito distrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminardistrito(int distrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

