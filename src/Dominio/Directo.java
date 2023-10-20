package Dominio;

public class Directo extends Empleado {
    protected long salario;


    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    protected long calcularSalud(){
        double porcentajeSalud= 0.057;
        return (long)(salario*porcentajeSalud);
    }
    protected long calcularPension(){
        double porcentajePension= 0.065;
        return (long)(salario*porcentajePension);
    }
    protected long calcularAporte(){
        return calcularPension() + calcularSalud();
    }

    @Override
    public long calcularSalario() {
    long salarioConAportes = salario-calcularAporte();
    return salarioConAportes;
    }
}

