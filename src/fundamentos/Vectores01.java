package fundamentos;

import java.util.Scanner;

public class Vectores01 {
    public static void main(String[] args) {
        String Productos[]= new String[5];
        double precioProducto[]= new double[5];
        Productos[0]="Mazamorra";
        Productos[4]="Otra mazamorra";
    Scanner sc=new Scanner(System.in);

        String masProductos[]={"Buñuelos","Empanadas","Perico","Tinto","Pan"};
        masProductos[1]="Claro";
    // 0 1 2 3 4
        for (int i=0 ; i< masProductos.length; i++){ // = 5
            System.out.println(masProductos[i]);
        }
        System.out.println("Lo que hay en el vector");
        for (int i=0; i<masProductos.length;i++){
            System.out.println(i+" : "+masProductos[i]);
        }
        System.out.println("Mostrando con bucle foreach");
        for(String producto: masProductos){
            System.out.println(producto);
        }
        System.out.println("Ingrese de datos al vector Productos");
        int contadorProd=0;
        double sumita=0;
        for (int i = 0; i < Productos.length; i++) {
            System.out.println("Producto: "+i);
            System.out.print("Please, ingrese el nombre de un producto: ");
            Productos[i]=sc.nextLine();
            sc.nextLine();
            System.out.println("ingrese precio del producto");
            precioProducto[i]= sc.nextDouble();
            sumita=sumita+precioProducto[i];
            if (precioProducto[i]>15000){
                contadorProd++;

            }

        }
        sumita=sumita/ precioProducto.length;
        System.out.println(sumita);
        System.out.println("Cantidad de productos con un precio mayor de 15000: "+contadorProd);


    }
}
