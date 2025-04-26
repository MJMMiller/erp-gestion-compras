package ec.edu.ups.poo;
import ec.edu.ups.poo.Models.*;
import ec.edu.ups.poo.Models.Enums.EstadoSolicitud;
import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.Enums.Rol;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Departamento departamento = new Departamento("Sistemas");
        Departamento departamento2 = new Departamento("Adminsitrativo");

        Empleado empleado = new Empleado("0107456022","Nicolás","Cedillo","099 181 9287","Calle de la verbena","nicocedillo@gmail.com",departamento, Rol.EMPLEADOR,"nicolascedillo@gmail.com","nicolas1");
        Empleado empleado1 = new Empleado("010562892","Mateo","Miller","096 294 2726","Av Guapondelig","mateomiller5@gmail.com",departamento2,Rol.EMPLEADOR,"mateomiller6@gmail.com","mateo1");

        ProductoConIva producto1 = new ProductoConIva(01, "Computadora",  500.0,"ASUS", Feriado.NO_FERIADO);
        ProductoSinIva producto2 = new ProductoSinIva(02,"Sal",2.0,"Mi Sal Querida", "El producto no agraba iva");

        Provedor provedor = new Provedor("0105236525","Juan","Perez","095 542 6252","Av de las Americas","juanperez@gmail.com");
        provedor.addProducto(producto1);



        GregorianCalendar fecha = new GregorianCalendar(2018, Calendar.JUNE, 15);
        SolicitudCompra solicitud1 = new SolicitudCompra(001,fecha,"Compras pendientes",empleado, EstadoSolicitud.SOLICITADA);
        solicitud1.addDetalle(01, producto1, 5, "---Sin Observaciones---");
        solicitud1.addDetalle(02, producto2, 5, "Es marina");
        System.out.println(solicitud1);
    }
}
