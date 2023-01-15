package modelos;

import interfaces.aterrizaje;
import interfaces.despegue;

public class Tripulada extends NaveEspacial implements despegue, aterrizaje {


    public int getid() {
        return id;
    }

    public int gettamano() {
        return tamano;
    }

    public String getnacionalidad() {
        return nacionalidad;
    }

    public double getpeso() {
        return peso;
    }

    public int getnumeroPasajeros() {
        return numeroPasajeros;
    }

    public boolean isreutilizable() {
        return reutilizable;
    }


    public void despegar() {

        if (combustible) {

            System.out.print("Despegue exitoso\n");
        } else {

            System.out.print("Despegue fallido\n");
        }


    }

    public void aterrizaje() {

        if (paracaidas && gravedad) {
            System.out.print("Aterrizaje exitoso\n");
        } else {
            System.out.print("Aterrizaje fallido\n");
        }


    }


}
