package Dominio;

public class Freelance extends Empleado {
    protected long valorHora;
    protected int horasTrabajadas;

    public Freelance(String nombre,long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return valorHora*horasTrabajadas;
    }
}
