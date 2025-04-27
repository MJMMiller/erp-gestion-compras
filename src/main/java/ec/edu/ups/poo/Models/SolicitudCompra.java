package ec.edu.ups.poo.Models;

import ec.edu.ups.poo.Models.Enums.EstadoSolicitud;
import ec.edu.ups.poo.Models.Interface.Calculable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

public class SolicitudCompra implements Calculable {

    private int id;
    private GregorianCalendar fecha;
    private String comentario;
    private Empleado empleadoSolicitante;
    private EstadoSolicitud estado;
    private List<DetalleSolicitud> detalles = new ArrayList<>();
    private double subtotal;
    private double iva;
    private double total;

    public SolicitudCompra(int id, GregorianCalendar fecha, String comentario, Empleado empleadoSolicitante, EstadoSolicitud estado) {
        this.id = id;
        this.fecha = fecha;
        this.comentario = comentario;
        this.empleadoSolicitante = empleadoSolicitante;
        this.estado = estado;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void addDetalle(int id, Producto itemProducto, int cantidad, String observacion) {
        detalles.add(new DetalleSolicitud(id, itemProducto, cantidad, observacion));
        calcularIva();
        calcularSubTotal();
    }



    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public Empleado getEmpleadoSolicitante() {
        return empleadoSolicitante;
    }

    public void setEmpleadoSolicitante(Empleado empleadoSolicitante) {
        this.empleadoSolicitante = empleadoSolicitante;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "SolicitudCompra{" +
                "\n\t\t|| id=" + id +
                "\t|| fecha=" + sdf.format(fecha.getTime()) +
                "\t|| comentario='" + comentario + '\'' +
                "\t|| estado=" + estado + " ||" +
                "\n\t\t----------------------------------------------------------------------------------------------"+
                "\n\t\t|| empleadoSolicitante=" + empleadoSolicitante +
                "\n\t\t----------------------------------------------------------------------------------------------"+
                "\n\t\t|| detalles=" + detalles +
                "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------"+
                "\n\t|| subtotal=" + subtotal +
                "\n\t|| iva=" + iva +
                "\n\t|| total=" + total+
                "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SolicitudCompra that = (SolicitudCompra) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public void calcularSubTotal() {
        double sumaSubtotal = 0;
        for (DetalleSolicitud det : detalles) {
            sumaSubtotal += det.getSubTotalDetalle();
        }
        setSubtotal(sumaSubtotal);
        setTotal(subtotal + iva);
    }
    public void calcularIva(){
        double sumaIVATotal = 0;
        for (DetalleSolicitud det : detalles) {
            sumaIVATotal += det.getIVAdetalle();
        }
        setIva(sumaIVATotal);

    }
}
