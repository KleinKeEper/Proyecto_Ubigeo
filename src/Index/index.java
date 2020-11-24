/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

import utils.leer;

/**
 *
 * @author CHRISTIAN
 */
public class index {

    private static ProvinciaIndex provinciaIndex;
    private static DepartamentoIndex departamentoIndex;

    public static void menu() {
        System.out.println("1. Departamento");
        System.out.println("2. Provincia");
        System.out.println("3. Distrito");
        System.out.println("4. Reporte");
        System.out.println("5. Salir");
    }

    public static void main(String[] args) {
        int opcion;

        do {
            menu();
            System.out.print("Ingrese una opcion valida: ");
            opcion = leer.entero();
            switch (opcion) {
                case 1:departamentoIndex.menuDepartamento();;
                    break;
                case 2:
                    provinciaIndex.menuProvincia();
                default:
                    break;
            }
        } while (opcion != 5);

    }

}
