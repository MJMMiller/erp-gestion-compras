package ec.edu.ups.poo.Models;

import java.util.List;

public class Provedor extends Persona{

    private List<Producto> productos;

    public Provedor(String cedula, String nombre, String apellido, String telefono, String direccion, String correo) {
        super(cedula, nombre, apellido, telefono, direccion, correo);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Provedor{" +
                "productos=" + productos +
                '}';
    }
}
