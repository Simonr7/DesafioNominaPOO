package Dominio;

public abstract class  Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = this.nombre;
    }
    public abstract long calcularSalario();
    public String getNombre(){
        return nombre;
    }
}