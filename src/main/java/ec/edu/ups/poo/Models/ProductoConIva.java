package ec.edu.ups.poo.Models;

import ec.edu.ups.poo.Models.Enums.Feriado;

import java.util.GregorianCalendar;

public class ProductoConIva extends Producto {
    private Feriado festividad;

    public ProductoConIva(int id, String nombre, Double precio, Feriado festividad) {
        super(id, nombre, precio);

        this.festividad = festividad;
    }

    public Feriado getFestividad() {
        return festividad;
    }

    public void setFestividad(Feriado festividad) {
        this.festividad = festividad;
    }

    @Override
    public String toString() {
        return   "Producto Con IVA { " +
                super.toString() +
                "porcentaje del IVA = " + festividad.getPorcentaje() +
                " , motivo del porcentaje =  " + festividad.getFecha() +
                " , impuesto =  " + calcularIVA() + " " +
                '}';
    }

    @Override
    double calcularIVA() {
        return getPrecio()*festividad.getPorcentaje() ;
    }
}
