package validacionSistemas;


import modelos.Tripulada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inicioValidacion {
    public static void consultaAdicional() {
        Scanner ingresoInformacion = new Scanner(System.in);
        Tripulada navedeprueba = new Tripulada();

        int comprobacion;
        boolean out = false;
        while (!out) {
            System.out.println("Por favor indique que desea validar:");
            System.out.println("1. Aterrizaje de nave");
            System.out.println("2. Despegue de nave");
            System.out.println("3. Salir");

            try {
                comprobacion = ingresoInformacion.nextInt();


                switch (comprobacion) {
                    case 1:
                        System.out.println("Se realizara validacion de aterrizaje de nave");
                        navedeprueba.aterrizaje();
                        break;
                    case 2:
                        System.out.println("Se realizara validacion de despegue de nave");
                        navedeprueba.despegar();
                        break;

                    case 3:
                        out = true;
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese una opcion valida.");
                ingresoInformacion.next();
            }
        }
    }
}