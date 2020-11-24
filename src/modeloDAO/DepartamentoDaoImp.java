package modeloDAO;

import config.bd.ConectaBd;
import interfaces.DepartamentoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Departamento;

public class DepartamentoDaoImp implements DepartamentoDao {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Departamento e = new Departamento();

    @Override
    public List listardepartamento() {
        ArrayList<Departamento> departamentos = new ArrayList<>();
        String consulta = " select * from departamento";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setIddepartamento(rs.getInt("iddepartamento"));
                departamento.setNombre_departamento(rs.getString("nombre_departamento"));
                departamentos.add(departamento);
            }
        } catch (Exception e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return departamentos;

    }

    @Override
    public Departamento buscardepartamento(int iddepartamento) {
        String consulta = " select * ********** "
                + " where *********** = " + iddepartamento;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIddepartamento(rs.getInt("iddepartamento"));
                e.setNombre_departamento(rs.getString("nombre departamento"));
            }
        } catch (Exception error) {
            System.out.println("Error: Problemas con el BUSCAR");
            System.out.println(error.getMessage());
        }
        return e;
    }

    @Override
    public boolean agregardepartamento(Departamento departamento) {
        String consulta = " insert into "
                + "departamento (nombre_departamento)"
                + "values ('" + departamento.getNombre_departamento() + "'" + ")";
        System.out.println(consulta);
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error: Problemas co el INSERT");
            System.out.println(error.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean editardepartamento(Departamento departamento) {
        String consulta = "update ************** "
                + " set "
                + "nombre departamento = '" + departamento.getNombre_departamento() + "' "
                + "where"
                + "iddepartamento = " + departamento.getIddepartamento();
        System.out.println(consulta);
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error: Problemas con la EDICION");
            System.out.println(error.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean eliminardepartamento(int iddepartamento) {
        String consulta = "delete from departamento"
                +" where iddepartamento = "+ iddepartamento;
        try{
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch(Exception error){
            System.out.println("Error: Problemas con el ELIMINAR");
            System.out.println(error.getMessage());
            return false;
        }
        return true;
    }

}
