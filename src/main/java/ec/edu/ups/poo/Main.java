package ec.edu.ups.poo;
import ec.edu.ups.poo.*;
import ec.edu.ups.poo.Models.DetalleSolicitud;
import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.ProductoConIva;
import ec.edu.ups.poo.Models.ProductoSinIva;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        DetalleSolicitud detalleSolicitud = new DetalleSolicitud();
        detalleSolicitud.calcularIva();

        ProductoSinIva arroz = new ProductoSinIva(01,"arroz",6.0, "felix");
        System.out.println("\n" + arroz);

        ProductoConIva aguacate = new ProductoConIva(02,"Guacate",9.0,Feriado.FERIADO_NAVIDAD);
        System.out.println(aguacate);
    }
}