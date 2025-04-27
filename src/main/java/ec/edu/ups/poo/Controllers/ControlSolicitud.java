package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.Departamento;
import ec.edu.ups.poo.Models.Empleado;
import ec.edu.ups.poo.Models.Enums.EstadoSolicitud;
import ec.edu.ups.poo.Models.Enums.Rol;
import ec.edu.ups.poo.Models.SolicitudCompra;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ControlSolicitud {
    private List<SolicitudCompra> solicitudes;


    public ControlSolicitud() {
        solicitudes = new ArrayList<>();

        Departamento departamento = new Departamento("Sistemas");
        Departamento departamento2 = new Departamento("Adminsitrativo");

        Empleado empleado = new Empleado("0107456022","Nicolás","Cedillo","099 181 9287","Calle de la verbena","nicocedillo@gmail.com",departamento, Rol.EMPLEADOR,"nicolascedillo@gmail.com","nicolas1");
        Empleado empleado1 = new Empleado("010562892","Mateo","Miller","096 294 2726","Av Guapondelig","mateomiller5@gmail.com",departamento2,Rol.EMPLEADOR,"mateomiller6@gmail.com","mateo1");

        ControlProducto cPro= new ControlProducto();

        GregorianCalendar fecha = new GregorianCalendar(2018, Calendar.JUNE, 15);
        SolicitudCompra solicitud1 = new SolicitudCompra(001,fecha,"Compras pendientes",empleado, EstadoSolicitud.SOLICITADA);
        solicitud1.addDetalle(01, cPro.getProductos(1), 5, "---Sin Observaciones---");
        solicitud1.addDetalle(02, cPro.getProductos(2), 5, "Es marina");

        solicitudes.add(solicitud1);
    }

    public SolicitudCompra getSolicitud(int n) {
        return solicitudes.get(n-1);
    }

    public void agregarSolicitud(SolicitudCompra nuevaSolicitud) {
        solicitudes.add(nuevaSolicitud);
    }
}