package Index;

import java.util.Iterator;
import java.util.List;import com.sun.tracing.dtrace.DependencyClass;

import interfaces.ProvinciaDao;
import modelo.Departamento;
import modelo.Provincia;
import modeloDAO.DepartamentoDaoImp;
import modeloDAO.ProvinciaDaoImp;
import utils.leer;

public class ProvinciaIndex {

	public static void listarProvincia() {
		 DepartamentoDaoImp departamentoDAO = new DepartamentoDaoImp();
	     List<Departamento> departamentos = departamentoDAO.listardepartamento();
	     ProvinciaDaoImp provinciaDaoImp = new ProvinciaDaoImp();
	     List<Provincia> provincias = provinciaDaoImp.listarProvincia();
	     leer.saltoLinea(1); 
	     System.out.println("\t## PROVINCIAS ##");
	     System.out.println("\033[0;1mID\tProvincia\tDepartamento");
	     
	     for (Departamento departamento : departamentos) {
	    	 for (Provincia provincia : provincias) {
		    	 if (departamento.getIddepartamento() == provincia.getIddepartamento()) {
					System.out.println("\u001B[0m"+  provincia.getIdprovincia() + "\t" +provincia.getNombre_provincia() + "\t\t" + departamento.getNombre_departamento() );
				}
		    	 
			}
		}  
	     
	}
	
	public static void insertarProvincia() {
		ProvinciaDaoImp provinciaDaoImp = new ProvinciaDaoImp();
		
		System.out.println("\t ## Nueva Provincia ##");
		System.out.print("Nombre Provincia: ");
		String nombre_provincia = leer.cadena();
		// DepartamentoDaoImp departamentoDAO = new DepartamentoDaoImp();
	    DepartamentoIndex.listardepartamento();
		leer.saltoLinea(1);
	    System.out.print("Ingrese el ID de un departamento: ");
	    int iddepartamento = leer.entero();
	    
		
		if (provinciaDaoImp.agregarProvinvia(new Provincia(0, nombre_provincia, iddepartamento))) 
			System.out.println("Se ingreso correctamente el registro !!!");
		else 
			System.out.println("Se produjo un error inesperado");
		
	}
	
	public static void eliminarProvincia() {
		System.out.println("Eliminar  provincia");
	}
	
	
	
	
	public static void menu() {
		leer.saltoLinea(1);
		System.out.println(" ----MENU PROVINCIA ---- "); 
		System.out.println("1. Listar Provincia ");
		System.out.println("2. Insertar Provincia ");
		System.out.println("3. Eliminar Provincia ");
		System.out.println("4. Regresar ");
		
	}
	
	
	public static void menuProvincia() {
		 int opcion;
	        do {
	            menu();
	            System.out.print("Ingrese una opcion valida: ");
	            opcion = leer.entero();
	            switch (opcion) {
	                case 1:
	                	listarProvincia();
	                    break;
	                case 2:
	                    insertarProvincia();
	                    break;
	                case 3:
	                	eliminarProvincia();
	                default:
	                    break;
	            }
	        } while (opcion != 4);

	    }
		
		
}
	
