package polimorfismo2;

public class Outsourcing extends Informaticos {
    /* Se declaran atributos globales privados para tener los valores retornados para un calculo*/
    private double sueldo;
    private double comision;
    /*Se crea una función que obtenga el valor calculado de la comision del metodo del padre y lo asigne al atributo privado*/
    public void suelco(double ventas){
        this.comision = super.comision(ventas);
    }
/* Se le asigna el sueldo obtenido a la variable sueldo*/
    public void sueldo(double suel){
        this.sueldo = suel;
    }
/* Se imprime y a su vez se calcula el total*/
    public void showTotal(){
        System.out.println("el sueldo del empleado es: "+
                this.sueldo +
                ". Su comision es de: " +
                this.comision +
                ". El total es de: \n" +
                (this.sueldo + this.comision));
    }
}
