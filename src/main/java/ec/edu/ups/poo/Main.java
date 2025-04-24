package ec.edu.ups.poo;

import ec.edu.ups.poo.Models.Enums.Feriado;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Feriado feriado = Feriado.FERIADO_NAVIDAD;
        System.out.println(feriado.getFecha());
        Feriado feriado1 = Feriado.NO_FERIADO;
        System.out.println(feriado1.getFecha());
    }
}