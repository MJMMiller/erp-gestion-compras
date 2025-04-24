package ec.edu.ups.poo.Models.Enums;

 import java.time.Month;

public enum Feriado {

    FERIADO_NAVIDAD(Month.DECEMBER, 25),
    NO_FERIADO(null,0),
    AÑO_NUEVO(Month.JANUARY, 1),
    FERIADO_FIESTAS_DE_CUENCA(Month.APRIL, 12);

    private Month mes;
    private int dia;

    Feriado(Month mes, int dia) {
        this.mes = mes;
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public Month getMes() {
        return mes;
    }

    public String getFecha(){
        return mes+" "+dia;
    }
}
