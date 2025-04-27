package ec.edu.ups.poo.Views;

import ec.edu.ups.poo.Controllers.ControlProducto;
import ec.edu.ups.poo.Controllers.ControlProvedor;
import ec.edu.ups.poo.Controllers.ControlSolicitud;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ViewConsole {
    Scanner sc = new Scanner(System.in);

    public void login(){

        System.out.println("===== BIENVENIDO AL SISTEMA ERP=====");
        System.out.print("Ingrese su nombre de usuario: ");
        String username = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Acceso concedido: Admin");
            menuAdmin();
        } else if (username.equals("user") && password.equals("user")) {
            System.out.println("Acceso concedido: User");
            menuEmpleado();
        }else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
        }
    }

    public void menuAdmin(){

        ControlProducto cPro = new ControlProducto();
        ControlProvedor cP = new ControlProvedor();
        ControlSolicitud cSol = new ControlSolicitud();
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP ( ADMIN )=====");
            System.out.println("1.  Registrar Proveedor");
            System.out.println("2.  Registrar Producto");
            System.out.println("3.  Registrar Solicitud");
            System.out.println("4.  Listar Proveedores");
            System.out.println("5.  Listar Productos");
            System.out.println("6.  Listar Solicitudes de Compra");
            System.out.println("7.  Buscar proveedor por ID");
            System.out.println("8.  Buscar proveedor por Nombre");
            System.out.println("9.  Buscar solicitud por ID");
            System.out.println("10. Aprobar / Rechazar solicitud de compra");
            System.out.println("11. Calcular total de una solicitud");
            System.out.println("12. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea
            System.out.println("---------------------------------------------");

            switch (opcion) {
                case 1:
                    cP.agregarProveedor();
                    break;
                case 2:
                    // cPro.agregarProducto();
                    break;
                case 3:
                    // cSol.agregarSolicitud();
                    break;
                case 4:
                    cP.printProvedores();
                    break;
                case 5:
                    // Ver Productos
                    break;
                case 6:
                    // Ver Solicitudes
                    break;
                case 7:
                    // Buscar proveedor por ID
                    break;
                case 8:
                    // Buscar proveedor por Nombre
                    break;
                case 9:
                    // Buscar solicitud por ID
                    break;
                case 10:
                    // Aprobar/Rechazar solicitud
                    break;
                case 11:
                    // Calcular total de una solicitud
                    break;
                case 12:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        }
    }


    public void menuEmpleado(){

        ControlProducto cPro= new ControlProducto();
        ControlProvedor cP = new ControlProvedor();

        ControlSolicitud cSol = new ControlSolicitud();
        System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP ( USER )=====");
        System.out.println("1.  Listar Proveedores");
        System.out.println("2.  Listar Productos");
        System.out.println("3.  Listar Solicitudes de Compra");
        System.out.println("4.  Buscar provedor por ID");
        System.out.println("5.  Buscar provedor por Nombre");
        System.out.println("6.  Buscar solicitud por ID");
        System.out.println("7. Calcular total de una solicitud");
        System.out.println("8. Salir");

        System.out.print("Seleccione una opcion: ");
        boolean continuar = true;
        while (continuar){
            int opcion = 0;

            switch (opcion) {
                case 1:
//                    cP.agregarProveedor();
                    break;
                case 2:
//                    cPro.agregarProducto();
                    break;
                case 3:
//                    cSol.agregarSolicitud();
                    break;
                case 4:
                    // Ver Proveedores
                    break;
                case 5:
                    // Ver Productos
                    break;
                case 6:
                    // Ver Solicitudes
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        }
    }
}
