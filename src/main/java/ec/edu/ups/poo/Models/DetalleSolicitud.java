package ec.edu.ups.poo.Models;

import ec.edu.ups.poo.Models.Interface.Calculable;
import ec.edu.ups.poo.Models.Producto;

public class DetalleSolicitud implements Calculable {

    private int item;
    private Producto itemProducto;
    private int cantidad;
    private String observacion;
    private Double ivaPorProducto;

}
