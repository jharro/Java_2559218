package fundamentos;

public class Condicional01 {
    public static void main(String[] args) {
        String nombre="JUan";
        String nombre2="JUAN";
        System.out.println(nombre.toLowerCase());

        if (nombre.equals(nombre2)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son diferentes");
        }
    }
}
