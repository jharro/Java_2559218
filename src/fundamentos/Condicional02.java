package fundamentos;

import java.util.Scanner;

public class Condicional02 {
    public static void main(String[] args) {
        char letra;
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        letra=sc.next().charAt(1);///abc

        switch(letra){
            case 'A':
            case 'a':
                System.out.println("Es una vocal---la A");
                break;
            case 'E':
                System.out.println("Es la B");
                break;
            default:
                System.out.println("Estás fuera...");
        }
    }
}
