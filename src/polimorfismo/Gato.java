package polimorfismo;

public class Gato extends Animal{
    @Override
    public void eat(){
        System.out.println("Gato está comiendo");
    }
    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    @Override
    public void attack(){
        System.out.println("el gatito esta atacando ");
    }
}
