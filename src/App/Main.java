package App;

import Dominio.*;

public class Main {
    public static void main(String [] args){
        Nomina nomina=new Nomina();
        Empleado juan= new Directo("Juan", 4_840_000);
        Empleado julian= new Vendedor("Julian",2_050_000,45_510_000);
        Empleado johanna= new Freelance("Johanna",71_000,89);
        Empleado claudia= new Vendedor("Claudia",1_380_000,35_989_000);
        Empleado david= new Directo("David",3_975_000);
        Empleado gustavo= new Freelance("Gustavo",42_500,65);
        nomina.agregarEmpleado(juan);
        nomina.agregarEmpleado(julian);
        nomina.agregarEmpleado(johanna);
        nomina.agregarEmpleado(claudia);
        nomina.agregarEmpleado(david);
        nomina.agregarEmpleado(gustavo);
        nomina.listarDirectos();
        nomina.listarFreelancers();
        nomina.calcularNomina();
    }
}
