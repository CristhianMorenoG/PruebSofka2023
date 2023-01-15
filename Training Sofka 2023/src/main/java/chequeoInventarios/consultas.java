package chequeoInventarios;

import repositorio.navesRepositorio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class consultas {
    static int peso;
    static int id;
    static int tamano;
    static String nacionalidad;
    static int numeroPasajeros;

    public static void consultaId() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;


        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("ID de la nave: ");
        id = ingresoInformacion.nextInt();
        System.out.println("El ID que desa consultar es:" + id + "?");
        System.out.println("1. Si");
        System.out.println("2. No");


        try {
            comprobacion = ingresoInformacion.nextInt();


            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda del siguiente ID:" + id);
                    navesRepositorio.consultarNavesID(id);
                    break;
                case 2:
                    System.out.println("Por favor ingrese el ID nuevamente");
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    public static void consultaPeso() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;
        int validacion;

        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Peso que desea consultar: ");
        peso = ingresoInformacion.nextInt();
        System.out.println("Desea consultar este peso exacto o validar pesos mayores/menores");
        System.out.println("1. Peso exacto");
        System.out.println("2. Peso mayor/menor");


        try {
            comprobacion = ingresoInformacion.nextInt();
            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda del siguiente peso exacto:" + peso);
                    navesRepositorio.consultarNavesPesoExacto(peso);
                    break;
                case 2:
                    System.out.println("Por favor indique si desea validar peso mayor o menor");

                    System.out.println("1. Peso mayor o igual");
                    System.out.println("2. Peso menor o igual");
                    validacion = ingresoInformacion.nextInt();
                    try {
                        switch (validacion) {
                            case 1:
                                System.out.println("Se realizara la busqueda de las naves con peso mayor o igual a:" + peso);
                                navesRepositorio.consultarNavesPesoMayora(peso);
                                break;
                            case 2:
                                System.out.println("Se realizara la busqueda de las naves con peso menor o igual a" + peso);
                                navesRepositorio.consultarNavesPesoMenora(peso);
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor ingrese una opcion valida.");
                        ingresoInformacion.next();
                    }

                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    public static void consultaTamano() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;
        int validacion;

        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Tamaño que desea consultar: ");
        tamano = ingresoInformacion.nextInt();
        System.out.println("Desea consultar este tamaño exacto o validar pesos mayores/menores");
        System.out.println("1. Tamaño exacto");
        System.out.println("2. Tamaño mayor/menor");


        try {
            comprobacion = ingresoInformacion.nextInt();
            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda del siguiente tamaño exacto:" + tamano);
                    navesRepositorio.consultarNavesTamanoExacto(tamano);
                    break;
                case 2:
                    System.out.println("Por favor indique si desea validar tamaño mayor o menor");

                    System.out.println("1. Tamaño mayor o igual");
                    System.out.println("2. Tamaño menor o igual");
                    validacion = ingresoInformacion.nextInt();
                    try {
                        switch (validacion) {
                            case 1:
                                System.out.println("Se realizara la busqueda de las naves con tamaño mayor o igual a: " + tamano);
                                navesRepositorio.consultarNavesTamanoMayora(tamano);
                                break;
                            case 2:
                                System.out.println("Se realizara la busqueda de las naves con tamaño menor o igual a: " + tamano);
                                navesRepositorio.consultarNavesTamanoMenora(tamano);
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor ingrese una opcion valida.");
                        ingresoInformacion.next();
                    }
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    public static void consultaNacionalidad() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;


        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Nacionalidad de la nave: ");
        nacionalidad = ingresoInformacion.nextLine();
        nacionalidad=nacionalidad.toLowerCase();
        System.out.println("La nacionalidad que desa consultar es:" + nacionalidad + "?");
        System.out.println("1. Si");
        System.out.println("2. No");


        try {
            comprobacion = ingresoInformacion.nextInt();


            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda de la siguiente nacionalidad:" + nacionalidad);
                    navesRepositorio.consultarNavesNacionalidad(nacionalidad);
                    break;
                case 2:
                    System.out.println("Por favor ingrese la nacionalidad nuevamente");
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    public static void consultaTipoNave() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;


        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Tipo de la nave: ");
        System.out.println("1. Nave tripulada");
        System.out.println("2. Nave no tripulada");
        System.out.println("3. Vehiculo lanzadera");

        try {
            comprobacion = ingresoInformacion.nextInt();


            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la verificacion de naves tripuladas");
                    navesRepositorio.consultarTipoNaveTripulada();
                    break;
                case 2:
                    System.out.println("Se realizara la verificacion de naves no tripuladas");
                    navesRepositorio.consultarTipoNaveNoTripulada();
                    break;
                case 3:
                    System.out.println("Se realizara la verificacion de vehiculos lanzaderas");
                    navesRepositorio.consultarTipoNaveVehiculoLanzadera();
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese una opcion valida.");
            ingresoInformacion.next();
        }
    }

    public static void consultaPasajeros() {
        Scanner ingresoInformacion = new Scanner(System.in);
        int comprobacion;
        int validacion;

        System.out.println("Por favor ingrese la siguiente informacion:");
        System.out.println("Cantidad de pasajeros a consultar: ");
        numeroPasajeros = ingresoInformacion.nextInt();
        System.out.println("Desea consultar este numero exacto o validar en cantidades mayores/menores");
        System.out.println("1. Numero exacto");
        System.out.println("2. Cantidad mayor/menor");


        try {
            comprobacion = ingresoInformacion.nextInt();
            switch (comprobacion) {
                case 1:
                    System.out.println("Se realizara la busqueda del siguiente numero de pasajeros exacto:" + numeroPasajeros);
                    navesRepositorio.consultarNavesPasajerosExacto(numeroPasajeros);
                    break;
                case 2:
                    System.out.println("Por favor indique si desea validar cantidad de pasajeros mayor o menor");

                    System.out.println("1. Cantidad de pasajeros mayor o igual");
                    System.out.println("2. Cantidad de pasajeros menor o igual");
                    validacion = ingresoInformacion.nextInt();
                    try {
                        switch (validacion) {
                            case 1:
                                System.out.println("Se realizara la busqueda de las naves con la cantidad de pasajeros mayor o igual a:" + numeroPasajeros);
                                navesRepositorio.consultarNavesPasajerosMayora(numeroPasajeros);
                                break;
                            case 2:
                                System.out.println("Se realizara la busqueda de las naves con la cantidad de pasajeros menor o igual a" + numeroPasajeros);
                                navesRepositorio.consultarNavesPasajerosMenora(numeroPasajeros);
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor ingrese una opcion valida.");
                        ingresoInformacion.next();
                    }

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