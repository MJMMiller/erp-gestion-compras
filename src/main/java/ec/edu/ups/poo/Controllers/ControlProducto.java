package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.Enums.Feriado;
import ec.edu.ups.poo.Models.Producto;
import ec.edu.ups.poo.Models.ProductoConIva;
import ec.edu.ups.poo.Models.ProductoSinIva;
import ec.edu.ups.poo.Models.Provedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProducto {
    private List<Producto> productos;
    Scanner sc = new Scanner(System.in);

    public ControlProducto() {
        productos = new ArrayList<>();

        ProductoConIva producto1 = new ProductoConIva(1, "Computadora",  500.0,"ASUS", Feriado.NO_FERIADO);
        ProductoSinIva producto2 = new ProductoSinIva(2,"Sal",2.0,"Mi Sal Querida", "El producto no agraba iva");
        ProductoConIva producto3 = new ProductoConIva(3, "Smartphone", 300.0, "Samsung", Feriado.NO_FERIADO);
        ProductoConIva producto4 = new ProductoConIva(4, "Televisor", 800.0, "LG", Feriado.NO_FERIADO);
        ProductoSinIva producto5 = new ProductoSinIva(5, "Agua mineral", 1.5, "Agua Pura", "Productoexento de IVA");
        ProductoSinIva producto6 = new ProductoSinIva(6, "Arroz", 1.2, "Grano de Oro", "No grava IVA según ley");
        ProductoConIva producto7 = new ProductoConIva(7, "Impresora", 150.0, "HP", Feriado.NO_FERIADO);
        ProductoSinIva producto8 = new ProductoSinIva(8, "Medicamento", 10.0, "SaludTotal", "Medicamento libre de IVA");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);

    }

    public Producto getProductos(int n) {
        return productos.get(n-1);
    }


    public Producto getProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            return productos.get(index);
        }
        return null;
    }

    public void agregarProducto() {
        ControlProvedor cP = new ControlProvedor();
        System.out.print("Ingrese la cantidad de productos a registrar: ");
        int numeroProductos = sc.nextInt();

        for (int i = 0; i < numeroProductos; i++){

            System.out.println("\t\tIngrese los datos del producto " + (i+1) + ": ");
            System.out.print("Categoría ( Comida / Primera_necesidad / Agricola / Medicina / Escolar / Etc ): ");
            String categoria = sc.next();
            System.out.print("\t\t\tID: ");
            int id = sc.nextInt();
            System.out.print("\t\t\tNombre: ");
            String nombre = sc.next();
            System.out.print("\t\t\tPrecio Unitario (,): ");
            Double precioUnitario = sc.nextDouble();
            sc.nextLine();
            System.out.print("\t\t\tMarca: ");
            String marca = sc.nextLine();

            System.out.print("\t\t\tProveedor (Ingrese su cédula): ");
            String cedula = sc.next();


            switch (categoria){
                case "Comida" , "Primera_necesidad" , "Agricola" , "Medicina" , "Escolar":
                    productos.add(new ProductoSinIva( id, nombre, precioUnitario, marca, "El producto no agraba iva"));
                    break;
                default:
                    productos.add(new ProductoConIva(id, nombre, precioUnitario, marca, Feriado.NO_FERIADO));
                    break;
            }
            if (cP.buscarProveedorPorCedula(cedula) != null) {
                cP.buscarProveedorPorCedula(cedula).addProducto(productos.get(productos.size()-1));
            } else {
                System.out.println("Proveedor no encontrado, producto sin proveedor");
            }
            System.out.println("Producto registrado correctamente.");
            System.out.println("---------------------------------------------");
        }
    }

    public void printProductos() {
        System.out.println("Lista de productos: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void buscarProductoPorID(int id) {
        for (Producto prod : productos) {
            if (prod.getId() == id) {
                System.out.println("Producto encontrado: " + "\n" +prod);
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void buscarProductoPorNombre(String nombre) {
        for (Producto prod : productos) {
            if (prod.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado: " + "\n" +prod);
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }


}
