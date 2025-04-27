package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.Producto;
import ec.edu.ups.poo.Models.ProductoConIva;
import ec.edu.ups.poo.Models.ProductoSinIva;
import java.util.ArrayList;
import java.util.List;

public class ControlProducto {
    private List<Producto> productos;

    public ControlProducto() {
        productos = new ArrayList<>();

        ProductoConIva producto1 = new ProductoConIva(01, "Computadora",  500.0,"ASUS", Feriado.NO_FERIADO);
        ProductoSinIva producto2 = new ProductoSinIva(02,"Sal",2.0,"Mi Sal Querida", "El producto no agraba iva");

        productos.add(producto1);
        productos.add(producto2);
    }

    public Producto getProductos(int n) {
        return productos.get(n-1);
    }

    public void agregarProducto(Producto nuevoProducto) {
        productos.add(nuevoProducto);
    }

    public void printProductos() {
        System.out.println("Lista de provedores: ");
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("---------");        }
    }


}
