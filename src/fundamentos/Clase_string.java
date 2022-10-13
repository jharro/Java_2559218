package fundamentos;

public class Clase_string {
    public static void main(String[] args) {
        String mensaje1="   Hoy es...   ";
        String mensaje2="  jueves   ";
        System.out.println(mensaje1.concat(mensaje2));
        System.out.println(mensaje2.endsWith("f"));
        String sinEspacios=mensaje1.trim();
        System.out.println(sinEspacios);
        System.out.println("Un cambio");
    }
}
