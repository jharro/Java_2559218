package herencia;

public class MainBici {
    public static void main(String[] args) {
        Bicicleta bici=new Bicicleta(340,40);
        BicicletaDeMontana biciM=new BicicletaDeMontana(100,35,20);
        System.out.println(bici.toString());
        System.out.println(biciM.toString());
    }
}
