package actualizacionInventario;


import modelos.NaveEspacial;
import modelos.NoTripulada;

import repositorio.navesRepositorio;


import java.util.Scanner;


public class inventarioNoTripulada extends NaveEspacial {

    public static void entradanaveNoTripulada() {

        Scanner ingresoInformacion = new Scanner(System.in);
        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("ID de la nave: ");
        id = ingresoInformacion.nextInt();
        System.out.println("ID de la nave: " + id);
        System.out.println("Pais de origen de la nave: ");
        ingresoInformacion.nextLine();
        nacionalidad = ingresoInformacion.nextLine();
        nacionalidad=nacionalidad.toLowerCase();
        System.out.println("Pais de origen de la nave: " + nacionalidad);
        System.out.println("Peso de la nave en Toneladas: ");
        peso = ingresoInformacion.nextDouble();
        System.out.println("Peso de la nave: " +peso+"T");
        System.out.println("Tamaño de la nave en metros: ");
        tamano = ingresoInformacion.nextInt();
        System.out.println("El tamaño de la nave es " +tamano+"M");
        System.out.println("La nave es reutilizable? (Y)(N)");
        reutilizable = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
        if(reutilizable==true){
            System.out.println("La nave es reutilizable");
        }
        else{
            System.out.println("La nave no es reutilizable");
        }
        navesRepositorio.insertNaveNoTripulada(new NoTripulada());
        System.out.println("Nave ingresada exitosamente");
    }
}

