package interfaces;

import java.util.List;
import modelo.Departamento;

public interface CRUD_Departamento {
    
    public List listardepartamento();
    public Departamento buscardepartamento(int iddepartamento);
    public boolean agregardepartamento(Departamento departamento);
    public boolean editardepartamento(Departamento departamento);
    public boolean eliminardepartamento(int departamento);
}
