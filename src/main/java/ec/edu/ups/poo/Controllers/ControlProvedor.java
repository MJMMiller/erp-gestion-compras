package ec.edu.ups.poo.Controllers;

import ec.edu.ups.poo.Models.Empleado;
import ec.edu.ups.poo.Models.Enums.Rol;
import ec.edu.ups.poo.Models.Departamento;
import ec.edu.ups.poo.Models.Provedor;

import java.util.ArrayList;
import java.util.List;

public class ControlProvedor {
    private List<Provedor> provedores;

    public List<Provedor> getProvedores() {
        return provedores;
    }

    public void ControlProvedor() {
        provedores = new ArrayList<>();

        Provedor provedor = new Provedor("0105236525","Juan","Perez","095 542 6252","Av de las Americas","juanperez@gmail.com");
        Provedor provedor2 = new Provedor("0108987654", "María", "Gomez", "096 123 4567", "Calle Larga", "mariagomez@hotmail.com");
        Provedor provedor3 = new Provedor("0101122334", "Carlos", "Vera", "098 765 4321", "Av Solano", "carlosvera@yahoo.com");

        provedores.add(provedor);
        provedores.add(provedor2);
        provedores.add(provedor3);
    }

    public void agregarProveedor(Provedor nuevoProveedor) {
        provedores.add(nuevoProveedor);
    }

    public void listarProveedores() {
        System.out.println("Lista de provedores: ");
        for (Provedor provedor : provedores) {
            System.out.println(provedor);
            System.out.println("---------");        }
    }
}
