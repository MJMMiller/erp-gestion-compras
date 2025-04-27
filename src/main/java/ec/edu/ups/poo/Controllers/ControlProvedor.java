package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.Provedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProvedor {
    Scanner sc = new Scanner(System.in);

    private List<Provedor> provedores;

    public ControlProvedor() {

        provedores = new ArrayList<>();

        Provedor provedor = new Provedor("0105236525","Juan","Perez","095 542 6252","Av de las Americas","juanperez@gmail.com");
        Provedor provedor2 = new Provedor("0108987654", "María", "Gomez", "096 123 4567", "Calle Larga", "mariagomez@hotmail.com");
        Provedor provedor3 = new Provedor("0101122334", "Carlos", "Vera", "098 765 4321", "Av Solano", "carlosvera@yahoo.com");

        provedores.add(provedor);
        provedores.add(provedor2);
        provedores.add(provedor3);
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
        System.out.println("Lista de provedores: ");
        for (Provedor provedor : provedores) {
            System.out.println("\t"+provedor);
        }
        System.out.println("---------------------------------------------");
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
}
