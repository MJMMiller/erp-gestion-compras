package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.*;
import ec.edu.ups.poo.Models.Enums.EstadoSolicitud;
import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.Enums.Rol;

import java.util.*;

public class ControlSolicitud {
    private List<SolicitudCompra> solicitudes;

    Scanner sc = new Scanner(System.in);

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

    public void agregarSolicitud() {

        Empleado empleado = new Empleado("0107456022","Nicolás","Cedillo","099 181 9287","Calle de la verbena","nicocedillo@gmail.com",departamento, Rol.EMPLEADOR,"nicolascedillo@gmail.com","nicolas1");


        System.out.print("Ingrese la cantidad de solicitudes a registrar: ");
        int numeroSolicitudes = sc.nextInt();

        for (int i = 0; i < numeroSolicitudes; i++){

            System.out.println("\t\tIngrese los datos de la solicitud " + (i+1) + ": ");
            System.out.println("Ingrese el ID de la solicitud: ");
            int idSolicitud = sc.nextInt();
            System.out.println("Ingrese el año: ");
            int año  = sc.nextInt();
            System.out.println("Ingrese el mes ( del 1 al 12 ): ");
            int mes = sc.nextInt() -1;
            System.out.println("Ingrese el día: ");
            int dia = sc.nextInt();
            GregorianCalendar fecha = new GregorianCalendar(año, mes, dia);
            System.out.println("Ingrese el comentario: ");
            String comentario = sc.next();
            solicitudes.add( new SolicitudCompra(idSolicitud,fecha,comentario,empleado,EstadoSolicitud.SOLICITADA));

            System.out.println("Ingrese detalles de la solicitud: ");
            boolean continuar = true;
            while (continuar){

            }

            System.out.println("Solicitud registrada correctamente.");
            System.out.println("---------------------------------------------");
        }
    }
}