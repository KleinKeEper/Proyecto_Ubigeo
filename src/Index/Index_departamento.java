package Index;

import java.util.List;
import modelo.Departamento;
import modeloDAO.DepartamentoDAO;

public class Index_departamento {

    public static void listardepartamento() {
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        List<Departamento> departamentos = departamentoDAO.listardepartamento();
        System.out.println("Listado de Departamentos");
        System.out.println("ID \t Nombre de Departamento");
        for (Departamento departamento : departamentos) {
            System.out.println(
                    departamento.getIddepartamento() + "\t"
                    + departamento.getNombre_departamento());
        }
    }
    
}

