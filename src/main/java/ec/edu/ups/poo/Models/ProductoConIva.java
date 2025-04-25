package ec.edu.ups.poo.Models;

import ec.edu.ups.poo.Models.Enums.Feriado;

public class ProductoConIva extends Producto {
    private Feriado festividad;

    public ProductoConIva(int id, String nombre, Double precioUnitario, String marca, Feriado festividad) {
        super(id, nombre, precioUnitario, marca);
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
        return   "\n\t\t\tProducto Con IVA { " +
                super.toString() +
                " || porcentaje del IVA = " + festividad.getPorcentaje() +
                " || impuesto =  " + calcularIVA() +
                " || motivo del porcentaje =  " + festividad.getFecha() +
                '}';
    }

    @Override
    double calcularIVA() {
        return getPrecioUnitario()*festividad.getPorcentaje() ;
    }
}
