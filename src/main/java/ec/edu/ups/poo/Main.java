package ec.edu.ups.poo;
import ec.edu.ups.poo.Models.DetalleSolicitud;
import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.ProductoConIva;
import ec.edu.ups.poo.Models.ProductoSinIva;

public class Main {
    public static void main(String[] args) {

        //ProductoSinIva arroz = new ProductoSinIva(01, "arroz", 6.0, "felix");
        //System.out.println("\n" + arroz);

        ProductoConIva producto1 = new ProductoConIva(01, "Computadora",  500.0,"ASUS", Feriado.NO_FERIADO);
        ProductoSinIva producto2 = new ProductoSinIva(02,"Sal",2.0,"Mi Sal Querida", "El producto no agraba iva");

        DetalleSolicitud detalleSolicitud = new DetalleSolicitud(01, producto1, 5, "---Sin Observaciones---");
        DetalleSolicitud detalleSolicitud2 = new DetalleSolicitud(02, producto2, 5, "Es marina");
        System.out.println(detalleSolicitud);
        System.out.println(detalleSolicitud2);
    }
}
