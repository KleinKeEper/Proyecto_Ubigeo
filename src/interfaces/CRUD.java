package interfaces;

<<<<<<< HEAD
public interface CRUD {

=======
import java.util.List;
import modelo.Distrito;

public interface CRUD {
    public List listardistritos();
    public Distrito buscardistrito(int distrito);
    public boolean agregardistrito(Distrito distito);
    public boolean editardistrito(Distrito distrito);
    public boolean eliminardistrito(int distrito); 
>>>>>>> d145b09c2df877b63a1bfbfac3cc30f29d7a0513
}
