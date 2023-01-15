package ingresoDatos;

import actualizacionInventario.opcionesInventario;
import chequeoInventarios.RevisionInventario;
import validacionSistemas.inicioValidacion;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Inicio {
    public static void entrada() {

        System.out.println("Bienvenido al sistema de consulta e inventario de naves");
        Scanner seleccionOpciones = new Scanner(System.in);
        boolean out = false;
        int opcion;

        while (!out) {
            System.out.println("Por favor seleccione una de las siguientes opciones:");
            System.out.println("1. Ingreso datos naves");
            System.out.println("2. Validacion inventario naves");
            System.out.println("3. Validacion comportamiento naves");
            System.out.println("4. Salir");

            try {
                opcion = seleccionOpciones.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion de ingresar datos de nave");
                        opcionesInventario.entrada();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion de validacion de inventario");
                        RevisionInventario.entradaInventario();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion de validacion de comportamiento de nave");
                        inicioValidacion.consultaAdicional();
                    case 4:
                        out = true;
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese una opcion valida.");
                seleccionOpciones.next();
            }
        }
    }
}





