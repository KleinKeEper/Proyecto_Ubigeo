package Index;

import java.util.List;import interfaces.DepartamentoDao;
import modelo.Departamento;
import modelo.Provincia;
import modeloDAO.DepartamentoDaoImp;
import utils.leer;

public class DepartamentoIndex {

    public static void listardepartamento() {
        DepartamentoDaoImp departamentoDAO = new DepartamentoDaoImp();
        List<Departamento> departamentos = departamentoDAO.listardepartamento();
        leer.saltoLinea(1);
        System.out.println("\t## DEPARTAMENTOS ##");
        System.out.println("\033[0;1mID" + "\tDepartamento");
        for (Departamento departamento : departamentos) {
            System.out.println("\u001B[0m" +
                    departamento.getIddepartamento() + "\t"
                    + departamento.getNombre_departamento());
        }
    }

    
    private static void eliminarDepartamento() {
    	// TODO Auto-generated method stub
    	listardepartamento();
    	leer.saltoLinea(1);
    	
    	System.out.print("Ingrese el Id a Eliminar");
    	int id = leer.entero();
    	if (new DepartamentoDaoImp().eliminardepartamento(id)) 
			System.out.println("Registro Eliminado Correctamente");
		
    	
		
    }
    
    
    private static void insertarDepartamento() {
    	// TODO Auto-generated method stub
     	System.out.println("\t ## Nuevo Departamento ##");
    		System.out.print("Nombre Departamento: ");
    		String nombre_departamento = leer.cadena();
    		
    		if (new DepartamentoDaoImp().agregardepartamento(new Departamento(0, nombre_departamento))) 
    			System.out.println("Se inserto correctamente el Registro !!!");
    			else 
    				System.out.println("Ocurrio un Error Inesperado !!!");
    	
    }
    
    public static void menu() {
    	leer.saltoLinea(1);
    	System.out.println(" ---- MENU DEPARTAMENTO ----");
		System.out.println("1. Listar Departamento ");
		System.out.println("2. Insertar Departamento ");
		System.out.println("3. Eliminar Departamento ");
		System.out.println("4. Regresar ");
		
	}
    
    public static void menuDepartamento() {
		 int opcion;
	        do {
	            menu();
	            System.out.print("Ingrese una opcion valida: ");
	            opcion = leer.entero();
	            switch (opcion) {
	                case 1:
	                	listardepartamento();;
	                    break;
	                case 2:
	                    insertarDepartamento();
	                    break;
	                case 3:
	                	eliminarDepartamento();
	                default:
	                    break;
	            }
	        } while (opcion != 4);

	    }


    
    
}

