package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner as=new Scanner(System.in);
        ArrayList<Persona> people =new ArrayList<>();;
        Persona persona  = new Persona();
        do {


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
            people.add(persona);
            System.out.println(persona.toString());

            System.out.print("¿Desea add una new person?: SI or NOT: ");

        }while (as.nextLine().equals("SI"));
        System.out.println("******************");
        System.out.println("Elementos/objetos en la lista");


        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i).getNombre()+" "+people.get(i).getDocumento()+
                    people.get(i).getAltura());
        }
    }

    //ArrayList [---,----,----,----]
    //            0    1   2    3
}
