package interfaces;

import java.util.List;
import modelo.Departamento;

public interface DepartamentoDao {
    
    public List listardepartamento();
    public Departamento buscardepartamento(int iddepartamento);
    public boolean agregardepartamento(Departamento departamento);
    public boolean editardepartamento(Departamento departamento);
    public boolean eliminardepartamento(int departamento);
}
