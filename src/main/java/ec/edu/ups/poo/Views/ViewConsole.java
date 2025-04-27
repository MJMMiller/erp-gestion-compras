package ec.edu.ups.poo.Views;

import ec.edu.ups.poo.Controllers.ControlProducto;
import ec.edu.ups.poo.Controllers.ControlProvedor;
import ec.edu.ups.poo.Controllers.ControlSolicitud;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ViewConsole {
    Scanner sc = new Scanner(System.in);

    public void login(){

        boolean accesoCorrecto = false;

        while (!accesoCorrecto) {
            System.out.println("===== BIENVENIDO AL SISTEMA ERP =====");
            System.out.print("Ingrese su nombre de usuario: ");
            String username = sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String password = sc.nextLine();

            if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin")) {
                System.out.println("Acceso concedido: Admin");
                System.out.println("---------------------------------------------");

                menuAdmin();
                accesoCorrecto = true;
            } else if (username.toLowerCase().equals("user") && password.toLowerCase().equals("user")) {
                System.out.println("Acceso concedido: User");
                System.out.println("---------------------------------------------");

                menuEmpleado();
                accesoCorrecto = true;
            } else {
                System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
                System.out.println("---------------------------------------------");
            }
        }
    }

    public void menuAdmin(){

        ControlProducto cPro = new ControlProducto();
        ControlProvedor cP = new ControlProvedor();
        ControlSolicitud cSol = new ControlSolicitud();
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP ( ADMIN ) =====");
            System.out.println("1.  Registrar Proveedor");
            System.out.println("2.  Registrar Producto");
            System.out.println("3.  Registrar Solicitud");
            System.out.println("4.  Listar Proveedores");
            System.out.println("5.  Listar Productos");
            System.out.println("6.  Listar Solicitudes de Compra");
            System.out.println("7.  Buscar proveedor por ID");
            System.out.println("8.  Buscar proveedor por Nombre");
            System.out.println("9.  Buscar producto por ID");
            System.out.println("10. Buscar producto por Nombre");
            System.out.println("11. Buscar solicitud por ID");
            System.out.println("12. Aprobar / Rechazar solicitud de compra");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------------------------");

            switch (opcion) {
                case 1:
                    cP.agregarProveedor();
                    break;
                case 2:
                    cPro.agregarProducto();
                    break;
                case 3:
                    // cSol.agregarSolicitud();
                    break;
                case 4:
                    cP.printProvedores();
                    break;
                case 5:
                    cPro.printProductos();
                    break;
                case 6:
                    // Ver Solicitudes
                    break;
                case 7:
                    System.out.print("Ingrese la Cedula / Ruc del proveedor a buscar: ");
                    String idProveedor = sc.nextLine();
                    cP.buscarProvedorPorID(idProveedor);
                    break;
                case 8:
                    System.out.print("Ingrese el nombre del proveedor a buscar: ");
                    String nombreProveedor = sc.nextLine();
                    cP.buscarProvedorPorNombre(nombreProveedor);
                    break;
                case 9:
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    String numeroProducto = sc.nextLine();
                    cPro.buscarProductoPorID(numeroProducto);
                    break;
                case 10:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreProducto = sc.nextLine();
                    cPro.buscarProductoPorNombre(nombreProducto);
                    break;
                case 11:
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
        System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP ( USER ) =====");
        System.out.println("1.  Listar Proveedores");
        System.out.println("2.  Listar Productos");
        System.out.println("3.  Listar Solicitudes de Compra");
        System.out.println("4.  Buscar provedor por ID");
        System.out.println("5.  Buscar provedor por Nombre");
        System.out.println("6.  Buscar solicitud por ID");
        System.out.println("7. Salir");

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
