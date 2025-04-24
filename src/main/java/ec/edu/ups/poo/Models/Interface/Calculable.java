package ec.edu.ups.poo.Models.Interface;

public interface Calculable {

    public static final double PORCENTAJE_IVA = 0.15;
    public static final double PORCENTAJE_IVA_FERIADO = 0.08;

    double calcularSubTotal();
    double calcularIva();
}
