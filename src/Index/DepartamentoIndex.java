package Index;

import utils.leer;

public class DepartamentoIndex {
	
	
	
	public static void ListarDepartamento() {
		System.out.println("Listar Departamento ");
	}
	
	public static void AgregarDepartamento() {
		System.out.println("Agregar Departamento ");
	}
	
	
	public static void menuDepartamento() {
		System.out.println("1. Listar Departamento");
		System.out.println("2. Agregar Departamento");
		System.out.println("3. Regresar");
	}

	
	
	public static void menu() {
		int opcion; 
		do {
			menuDepartamento();
			opcion = leer.entero();
			switch (opcion) {
			case 1:
				ListarDepartamento();
				break;
			case 2 :
				AgregarDepartamento();
			default:
				break;
			}
			
		} while (opcion != 3);
	}
	
	
}
