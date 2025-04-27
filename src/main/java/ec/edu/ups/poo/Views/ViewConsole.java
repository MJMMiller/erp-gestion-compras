package ec.edu.ups.poo.Views;

import ec.edu.ups.poo.Controllers.ControlProducto;
import ec.edu.ups.poo.Controllers.ControlProvedor;
import ec.edu.ups.poo.Controllers.ControlSolicitud;
import ec.edu.ups.poo.Models.Departamento;
import ec.edu.ups.poo.Models.Empleado;
import ec.edu.ups.poo.Models.Enums.Rol;
import java.util.Scanner;

public class ViewConsole {

    Scanner sc = new Scanner(System.in);
    private Empleado empleadoLogueado;

    ControlProducto cPro = new ControlProducto();
    ControlProvedor cP = new ControlProvedor();
    ControlSolicitud cSol = new ControlSolicitud();

    public void login() {

        boolean accesoCorrecto = false;

        while (!accesoCorrecto) {

            String[] credenciales = ingresarCredenciales();
            String username = credenciales[0];
            String password = credenciales[1];

            if (username.equals("mateomiller1605@gmail.com") && password.equals("MJMMiller")) {
                accesoAdministrativo();
                accesoCorrecto = true;

            } else if (username.equals("nicolascedillo@gmail.com") && password.equals("nicolas1")) {
                accesoEmpleado();
                accesoCorrecto = true;

            } else {
                System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
                System.out.println("---------------------------------------------");
            }
        }
    }

    public String[] ingresarCredenciales() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BIENVENIDO AL SISTEMA ERP =====");
        System.out.print("Ingrese su nombre de usuario: ");
        String username = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();

        return new String[] { username, password };
    }

    public void accesoAdministrativo() {
        System.out.println("Acceso concedido: Mateo Miller");
        System.out.println("---------------------------------------------");

        Departamento departamentoAdmin = new Departamento("Administrativo");
        empleadoLogueado = new Empleado(
                "010562892", "Mateo", "Miller", "096 294 2726",
                "Av Guapondelig", "mateomiller5@gmail.com",
                departamentoAdmin, Rol.ADMINISTRATIVO,
                "mateomiller1605@gmail.com", "MJMMiller"
        );

        menu(1);
    }

    public void accesoEmpleado() {
        System.out.println("Acceso concedido: Nicolas Cedillo");
        System.out.println("---------------------------------------------");

        Departamento departamentoSistemas = new Departamento("Sistemas");
        empleadoLogueado = new Empleado(
                "0107456022", "Nicolás", "Cedillo", "099 181 9287",
                "Calle de la verbena", "nicocedillo@gmail.com",
                departamentoSistemas, Rol.EMPLEADOR,
                "nicolascedillo@gmail.com", "nicolas1"
        );

        menu(2);
    }

    public void menu(int id){

        boolean continuar = true;

        if (id == 1) {
            while (continuar) {
                int opcion = menuAdmin();
                switch (opcion) {
                    case 1:
                        cP.agregarProveedor();
                        break;
                    case 2:
                        cPro.agregarProducto();
                        break;
                    case 3:
                        cSol.agregarSolicitud(empleadoLogueado);
                        break;
                    case 4:
                        cP.printProvedores();
                        break;
                    case 5:
                        cPro.printProductos();
                        break;
                    case 6:
                        cSol.printSolicitudes();
                        break;
                    case 7:
                        buscarProveedorPorID();
                        break;
                    case 8:
                        buscarProveedorPorNombre();
                        break;
                    case 9:
                        buscarProductoPorID();
                        break;
                    case 10:
                        buscarProductoPorNombre();
                        break;
                    case 11:
                        buscarSolicitudPorID();
                        break;
                    case 12:
                        buscarSolicitudPorEstado();
                        break;
                    case 13:
                        cambiarEstadoSolicitud();
                        break;
                    case 14:
                        continuar = false;
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente nuevamente.");
                }
            }
        }else {
            while (continuar) {
                int opcion = menuEmpleado();
                switch (opcion) {
                    case 1:
                        cPro.agregarProducto();
                        break;
                    case 2:
                        cSol.agregarSolicitud(empleadoLogueado);
                        break;
                    case 3:
                        cP.printProvedores();
                        break;
                    case 4:
                        cPro.printProductos();
                        break;
                    case 5:
                        cSol.printSolicitudes();
                        break;
                    case 6:
                        buscarProveedorPorID();
                        break;
                    case 7:
                        buscarProveedorPorNombre();
                        break;
                    case 8:
                        buscarProductoPorID();
                        break;
                    case 9:
                        buscarProductoPorNombre();
                        break;
                    case 10:
                        buscarSolicitudPorID();
                        break;
                    case 11:
                        buscarSolicitudPorEstado();
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
    }

    public int menuAdmin(){

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
        System.out.println("12. Buscar solicitud por Estado");
        System.out.println("13. Cambiar estado solicitud de compra");
        System.out.println("14. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------------------");
        return opcion;
    }

    public int menuEmpleado(){

        System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP ( USER ) =====");
        System.out.println("1.  Registrar Producto");
        System.out.println("2.  Registrar Solicitud");
        System.out.println("3.  Listar Proveedores");
        System.out.println("4.  Listar Productos");
        System.out.println("5.  Listar Solicitudes de Compra");
        System.out.println("6.  Buscar proveedor por ID");
        System.out.println("7.  Buscar proveedor por Nombre");
        System.out.println("8.  Buscar producto por ID");
        System.out.println("9.  Buscar producto por Nombre");
        System.out.println("10. Buscar solicitud por ID");
        System.out.println("11. Buscar solicitud por Estado");
        System.out.println("12. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------------------");
        return opcion;
    }

    public void buscarProveedorPorID() {
        System.out.print("Ingrese la Cedula / Ruc del proveedor a buscar: ");
        String idProveedor = sc.nextLine();
        cP.buscarProvedorPorID(idProveedor);
    }

    public void buscarProveedorPorNombre() {
        System.out.print("Ingrese el nombre del proveedor a buscar: ");
        String nombreProveedor = sc.nextLine();
        cP.buscarProvedorPorNombre(nombreProveedor);
    }

    public void buscarProductoPorID() {
        System.out.print("Ingrese el ID del producto a buscar: ");
        int numeroProducto = sc.nextInt();
        cPro.buscarProductoPorID(numeroProducto);
        sc.nextLine(); // Limpiar el buffer
    }

    public void buscarProductoPorNombre() {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreProducto = sc.nextLine();
        cPro.buscarProductoPorNombre(nombreProducto);
    }

    public void buscarSolicitudPorID() {
        System.out.print("Ingrese el ID de la solicitud a buscar: ");
        int idSolicitud = sc.nextInt();
        cSol.buscarSolicitudPorID(idSolicitud);
        sc.nextLine(); // Limpiar el buffer
    }

    public void buscarSolicitudPorEstado() {
        System.out.print("Seleccione el estado de la solicitud a buscar (SOLICITADA / EN_REVISION / APROVADA / RECHAZADA): ");
        String estadoSolicitud = sc.nextLine();
        cSol.buscarSolicitudPorEstado(estadoSolicitud);
    }

    public void cambiarEstadoSolicitud() {
        System.out.print("Seleccione el ID de la solicitud a cambiar estado: ");
        int idSolicitudCambio = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el estado a cambiar la solicitud (SOLICITADA / EN_REVISION / APROVADA / RECHAZADA): ");
        String estadoSolicitudCambio = sc.nextLine();
        cSol.cambiarEstadoSolicitud(idSolicitudCambio, estadoSolicitudCambio);
    }

}
