package herencia01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Estudiante est1=new Estudiante();
        System.out.println("Nombre del estudiante: ");
    est1.setNombre(sc.nextLine());
        System.out.println("Dirección: ");
        est1.setDireccion(sc.nextLine());


        System.out.println(est1.toString());
    }
}
