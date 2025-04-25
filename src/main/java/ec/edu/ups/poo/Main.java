package ec.edu.ups.poo;
import ec.edu.ups.poo.Models.DetalleSolicitud;
import ec.edu.ups.poo.Models.Enums.EstadoSolicitud;
import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.ProductoConIva;
import ec.edu.ups.poo.Models.ProductoSinIva;
import ec.edu.ups.poo.Models.SolicitudCompra;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ProductoSinIva arroz = new ProductoSinIva(01, "arroz", 6.0, "felix");
        //System.out.println("\n" + arroz);

        ProductoConIva producto1 = new ProductoConIva(01, "Computadora",  500.0,"ASUS", Feriado.NO_FERIADO);
        ProductoSinIva producto2 = new ProductoSinIva(02,"Sal",2.0,"Mi Sal Querida", "El producto no agraba iva");

        DetalleSolicitud detalleSolicitud = new DetalleSolicitud(01, producto1, 5, "---Sin Observaciones---");
        DetalleSolicitud detalleSolicitud2 = new DetalleSolicitud(02, producto2, 5, "Es marina");
        //System.out.println(detalleSolicitud);
        //System.out.println(detalleSolicitud2);

        List<DetalleSolicitud> detalles1 = new ArrayList<>();
        detalles1.add(detalleSolicitud);
        detalles1.add(detalleSolicitud2);

        GregorianCalendar fecha = new GregorianCalendar(2018, Calendar.JUNE, 15);
        SolicitudCompra solicitud1 = new SolicitudCompra(001,fecha,"Compras pendientes",null, EstadoSolicitud.SOLICITADA,detalles1);
        System.out.println(solicitud1);
    }
}
