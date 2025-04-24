package ec.edu.ups.poo.Models;

import ec.edu.ups.poo.Models.Enums.EstadoSolicitud;
import ec.edu.ups.poo.Models.Interface.Calculable;

import java.util.GregorianCalendar;
import java.util.List;

public class SolicitudCompra implements Calculable {

    private int id;
    private GregorianCalendar fecha;
    private String comentario;
    private Empleado empleadoSolicitante;
    private EstadoSolicitud estado;
    private List<DetalleSolicitud> detalles;

}
