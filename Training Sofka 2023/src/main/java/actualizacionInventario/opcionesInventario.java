package actualizacionInventario;
import java.util.Scanner;
import java.util.InputMismatchException;
public class opcionesInventario {
    public static void entrada () {

        System.out.println ("Bienvenido al sistema de inventario de naves");
        Scanner seleccionOpciones = new Scanner(System.in);
        boolean out = false;
        int opcion;

        while (!out) {
            System.out.println("Por favor indique el tipo de nave que desea ingresar:");
            System.out.println("1. Nave Tripulada");
            System.out.println("2. Nave no tripulada");
            System.out.println("3. Vehiculo Lanzadera");
            System.out.println("4. Salir");

            try {
                opcion = seleccionOpciones.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion de ingresar datos de nave tripulada");
                        inventarioTripulada.entradanaveTripulada();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion de ingresar datos de nave no tripulada");
                        inventarioNoTripulada.entradanaveNoTripulada();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion de ingresar datos de Vehiculo Lanzadera");
                        inventarioVehiculoLanzadera.entradanaveTipoLanzadera();
                        break;
                    case 4:
                        out = true;
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");

                }
            }
            catch (InputMismatchException e) {
                System.out.println("Por favor ingrese una opcion valida.");
                seleccionOpciones.next();
            }
        }
    }








}
