package polimorfismo;

public class Perro extends Animal{
    @Override
    public void eat(){
        System.out.println("perro comiendo");
    }
    @Override
    public void sleep(){
        System.out.println("dog sleeping");
    }
}
