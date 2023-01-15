package chequeoInventarios;


import java.util.Scanner;
import java.util.InputMismatchException;
import validacionSistemas.inicioValidacion;




public class RevisionInventario {
    public static void entradaInventario() {
        System.out.println("Bienvenido al sistema de consulta de naves");
        Scanner seleccionOpciones = new Scanner(System.in);
        boolean out = false;
        int opcion;

        while (!out) {
            System.out.println("Por favor seleccione una de las siguientes opciones de consulta:");
            System.out.println("1. Consulta por ID");
            System.out.println("2. Consulta por peso");
            System.out.println("3. Consulta por tamaño");
            System.out.println("4. Consulta por nacionalidad");
            System.out.println("5. Consulta por tipo de nave");
            System.out.println("6. Consulta por cantidad de pasajeros");
            System.out.println("7. Consultas adicionales");
            System.out.println("8. Salir");

            try {
                opcion = seleccionOpciones.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion de consultar por ID");
                        consultas.consultaId();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion de consulta por peso");
                        consultas.consultaPeso();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion de consulta por tamaño");
                        consultas.consultaTamano();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion de consulta por nacionalidad");
                        consultas.consultaNacionalidad();
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion de consulta por tipo de nave");
                        consultas.consultaTipoNave();
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion de consulta por capacidad de pasajeros");
                        consultas.consultaPasajeros();
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion de consultas adicionales");
                        inicioValidacion.consultaAdicional();
                        break;
                    case 8:
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




