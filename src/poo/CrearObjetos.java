package poo;

public class CrearObjetos {
    public static void main(String[] args) {
        Monstruo minkMonstruo = new Monstruo("Vampiro",230,350,2.6f,600,"Palidito muerto",4);

        System.out.println(minkMonstruo.getNombre());
        System.out.println(minkMonstruo.getEdad());
        System.out.println(minkMonstruo.getAltura());

        minkMonstruo.setEdad(500);
        System.out.println("La nueva edad del monstruo");
        System.out.println(minkMonstruo.getEdad());
        minkMonstruo.volar();
        System.out.println(minkMonstruo.toString());








    }
}
