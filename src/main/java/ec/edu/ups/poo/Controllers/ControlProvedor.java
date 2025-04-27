package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.Producto;
import ec.edu.ups.poo.Models.Provedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProvedor {
    Scanner sc = new Scanner(System.in);

    private List<Provedor> provedores;

    ControlProducto cPro = new ControlProducto();

    public ControlProvedor() {

        provedores = new ArrayList<>();

        Provedor provedor = new Provedor("0105236525","Juan","Perez","095 542 6252","Av de las Americas","juanperez@gmail.com");
        Provedor provedor2 = new Provedor("0108987654", "María", "Gomez", "096 123 4567", "Calle Larga", "mariagomez@hotmail.com");
        Provedor provedor3 = new Provedor("0101122334", "Carlos", "Vera", "098 765 4321", "Av Solano", "carlosvera@yahoo.com");
        Provedor provedor4 = new Provedor("0105566778", "Lucía", "Mendoza", "097 334 2211", "Av Ordóñez Lasso", "luciamendoza@gmail.com");
        Provedor provedor5 = new Provedor("0103344556", "Andrés", "Salazar", "096 778 8899", "Calle Bolívar", "andressalazar@outlook.com");
        Provedor provedor6 = new Provedor("0106677889", "Patricia", "Rivas", "095 112 3344", "Av Loja", "patriciarivas@hotmail.com");
        Provedor provedor7 = new Provedor("0102233445", "Diego", "Martínez", "098 556 7788", "Camino del Tejar", "diegomartinez@yahoo.com");
        Provedor provedor8 = new Provedor("0104455667", "Ana", "Cárdenas", "097 665 4433", "Av Remigio Crespo", "anacardenas@gmail.com");

        provedores.add(provedor);
        provedores.add(provedor2);
        provedores.add(provedor3);
        provedores.add(provedor4);
        provedores.add(provedor5);
        provedores.add(provedor6);
        provedores.add(provedor7);
        provedores.add(provedor8);


        provedor.addProducto(cPro.getProducto(1));
        provedor2.addProducto(cPro.getProducto(2));
        provedor3.addProducto(cPro.getProducto(3));
        provedor4.addProducto(cPro.getProducto(4));
        provedor5.addProducto(cPro.getProducto(5));
        provedor6.addProducto(cPro.getProducto(6));
        provedor7.addProducto(cPro.getProducto(7));
        provedor8.addProducto(cPro.getProducto(8));

    }

    public Provedor getProvedores(int n) {
        return provedores.get(n-1);
    }

    public void agregarProveedor() {
        System.out.print("Ingrese la cantidad de proveedores a registrar: ");
        int numeroProvedores = sc.nextInt();

        for (int i = 0; i < numeroProvedores; i++){
            System.out.println("\t\tIngrese los datos del proveedor " + (i+1) + ": ");
            System.out.print("\t\t\tCédula: ");
            String cedula = sc.next();
            System.out.print("\t\t\tNombre: ");
            String nombre = sc.next();
            System.out.print("\t\t\tApellido: ");
            String apellido = sc.next();
            System.out.print("\t\t\tTeléfono: ");
            String telefono = sc.next();
            System.out.print("\t\t\tDirección: ");
            String direccion = sc.next();
            System.out.print("\t\t\tCorreo: ");
            String correo = sc.next();
            provedores.add(new Provedor(cedula, nombre, apellido, telefono, direccion, correo));
        }
        System.out.println("Proveedores registrados correctamente.");
        System.out.println("---------------------------------------------");

    }

    public void printProvedores() {

       System.out.println("Lista de proveedores: ");
        for (Provedor provedor : provedores) {
            System.out.println("\t" + provedor);

            System.out.println("---------------------------------------------");
        }
    }

    public void buscarProvedorPorID(String id) {
        for (Provedor prov : provedores) {
            if (prov.getCedula().equals(id)) {
                System.out.println("Proveedor encontrado: " + "\n" +prov);
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Proveedor no encontrado.");
    }

    public void buscarProvedorPorNombre(String nombre) {
        for (Provedor prov : provedores) {
            if (prov.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Proveedor encontrado: " + "\n" +prov);
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Proveedor no encontrado.");
    }

    public Provedor buscarProveedorPorCedula(String cedula) {
        for (Provedor prov : provedores) {
            if (prov.getCedula().equals(cedula)) {
                return prov;
            }
        }
        return null;
    }

}