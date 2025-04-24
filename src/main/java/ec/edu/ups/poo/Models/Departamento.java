package ec.edu.ups.poo.Models;

import java.util.List;

public class Departamento {

    private String name;
    private List<Empleado> empleados;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "name='" + name + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
