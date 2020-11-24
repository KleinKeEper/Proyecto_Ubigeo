package interfaces;

import java.util.List;
import modelo.Distrito;

public interface DistritoDao {

    public List listardistritos();

    public Distrito buscardistrito(int distrito);

    public boolean agregardistrito(Distrito distito);

    public boolean editardistrito(Distrito distrito);

    public boolean eliminardistrito(int distrito);

}
