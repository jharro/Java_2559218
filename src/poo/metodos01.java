package poo;

import java.util.Scanner;

public class metodos01 {

    public static void main(String[] args) {
       /* sumar(-111,10);
        sumar(10.4f , 20.7f);
        int suma=sumar(20.5f,34.98, 10);
        System.out.println("La suma de los 3 núemros es "+suma);*/
        Scanner sc = new Scanner(System.in);
        float peso, altura;
        System.out.println("Peso: ");
        peso=sc.nextFloat();
        System.out.println("Estatura: ");
        altura=sc.nextFloat();
        String valor_imc;
        valor_imc=calcularImc(peso,altura);
        System.out.println(valor_imc);
    }
// SOBRECARGA DE MÉTODOS
    static void sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("La suma de los números es: "+suma);
    }
    static void sumar(float num1, float num2){
        float suma= num1+num2;
        System.out.println("La suma de los float es "+suma);
    }

    static int sumar(float num1, double num2, int num3){ // 20.5 34.98 10
        int suma  = (int) (num1 + num2 + num3); // CASTING  154.98 -- 154
        return suma;
    }

    static void saludar(){
        System.out.println("Hola mundo");
    }
    static String saludar(String nombre){
        return "Hola "+nombre;
    }

    static String calcularImc(float peso, float altura){
        double imc = peso/(Math.pow(altura,2));
        return "Su imc es: "+ imc;
    }

}
