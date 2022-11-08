package herencia;

/*Clase derivada o hija*/
public class BicicletaDeMontana extends Bicicleta {
    //La subclase Bicicleta de Montaña agrega un atributo más
    public int alturaSilla;

    //La subclase BicicletaDeMontana tiene un constructor
    public BicicletaDeMontana(int engranaje, int velocidad, int alturaInicial){
        //Invoca a la clase base Bicicleta
        super(engranaje,velocidad);
        alturaSilla=alturaInicial;
    }

    //La subclase BicicletaDeMontana agrega un método más


    public void setAlturaSilla(int alturaSilla) {
        this.alturaSilla = alturaSilla;
    }
    /*Sobreescribe el método toString() de la
    clase Bicicleta para imprimir más información
     */
// https://www.geeksforgeeks.org/inheritance-in-java/

}
