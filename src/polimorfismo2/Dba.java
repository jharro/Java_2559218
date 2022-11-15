package polimorfismo2;

public class Dba extends Informaticos{
    public void datos(String nombre, String apellido){
        System.out.println("Soy un DBA y me llamo "+nombre.concat(apellido));

    }
    public void funciones(String funcion, int horas){
        System.out.println("Soy DBA y hago "+funcion+" y trabajo "+horas+" horas");
    }
    public void sueldo(int horas, double valorH){
        System.out.println("Soy un DBA y me gano "+(horas*valorH));
    }
}
