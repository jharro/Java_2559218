package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Desarrollador desarrolladorsito = new Desarrollador();
        desarrolladorsito.datos("Yolanda");
        desarrolladorsito.sueldo(1500000);
        desarrolladorsito.funciones("Codificar");

        /*el DBA*/

        Dba elpiton = new Dba();

        elpiton.datos("Elber","Gargon");
        elpiton.sueldo(48,6000);
        elpiton.funciones("analista",55);

        Outsourcing Outsor1 = new Outsourcing();
        Outsor1.suelco(2000000);
        Outsor1.sueldo(3500000);
        Outsor1.showTotal();

    }
}
