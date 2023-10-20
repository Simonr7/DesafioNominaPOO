package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados= new ArrayList<>();
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);

    }

    public void calcularNomina(){
        for(Empleado empleado: empleados){
            String nombre=empleado.getNombre();
            String tipoDeEmpleado = empleado.getClass().getSimpleName();
            System.out.println(tipoDeEmpleado + nombre);
            long salario= empleado.calcularSalario();
            System.out.println(salario);
        }
    }

    public void listarDirectos() {
        for (Empleado empleado : empleados) {
            if (empleados instanceof Directo) {
                System.out.println(empleado.getNombre());
            }

        }
    }
    public void listarFreelancers() {

            for(Empleado empleado: empleados){
                if(empleados instanceof Freelance){
                    System.out.println(empleado.getNombre());
                }
            }
        }
    }


