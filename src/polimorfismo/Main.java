package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal perrito =new Perro();
        perrito.eat();
        perrito.sleep();
        perrito.attack();
        Animal gatito =new Gato();
        gatito.attack();

    }
}
