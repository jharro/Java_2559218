package herencia;
/*  Programa para ilustrar el concepto de herencia
    Clase base*/
public class Bicicleta {
    //La clase Bicicleta tiene dos atributos
    protected int engranaje;
    protected  int velocidad;

    //La clase Bicicleta tiene un constructor

    public Bicicleta(int engranaje, int velocidad) {
        this.engranaje = engranaje;
        this.velocidad = velocidad;
    }

    //La clase Bicicleta tiene tres métodos
    public void aplicarFreno(int decrementar){
        velocidad-=decrementar;
    }
    public void acelerar(int incremento){
        velocidad+=incremento;
    }

    //El método toString() para imprimir la info de la Bicicleta
    @Override
    public String toString(){
        return "No de engranajes: "+engranaje+"\n"+
                "La velocidad de la bicicleta es "+velocidad;
    }
}
