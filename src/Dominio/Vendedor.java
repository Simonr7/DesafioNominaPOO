package Dominio;

public class Vendedor extends Directo{
    protected long ventasDelMes;
    public static final int SALARIO_LIMITE=1_500_000;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre,salario);
        this.ventasDelMes = ventasDelMes;
    }
    protected long calcularComision(){
      double porcentajeComision;
      if(super.calcularSalario()<=SALARIO_LIMITE){
          porcentajeComision=0.045;

      }
      else{
          porcentajeComision=0.035;

      }
      long comision = (long)(ventasDelMes*porcentajeComision);
        System.out.println("salario con comision" + comision);
      return comision;

    }
}
