package poo;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner as=new Scanner(System.in);
        do {
            Persona persona = new Persona();
            System.out.print("Documento: ");
            persona.setDocumento(sc.nextLine());
            System.out.print("Nombre: ");
            persona.setNombre(sc.nextLine());
            System.out.print("Edad: ");
            persona.setEdad(sc.nextInt());
            System.out.print("Sexo [M o F] : ");
            persona.setSexo(sc.next().charAt(0));
            System.out.print("Peso: ");
            persona.setPeso(sc.nextDouble());
            System.out.print("Altura: ");
            persona.setAltura(sc.nextDouble());
            System.out.println(persona.toString());
            System.out.print("¿Desea add una new person?: SI or NOT: ");

        }while (as.nextLine().equals("SI"));
    }
}
