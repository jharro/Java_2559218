package poo;

public class Persona {
    private String documento="";
    private String nombre="";
    private int edad=0;
    private char sexo='M';
    private double peso=0;
    private double altura=0;

    //Constructores
    Persona(){

    }

    public Persona(String documento, String nombre, int edad, char sexo) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String documento, String nombre, int edad, char sexo, double peso, double altura) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //Setter y Getter
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {// M F K L P O H
        if (sexo == 'M' || sexo =='F'){
            this.sexo = sexo;
        }
        else{
            this.sexo='M';
        }

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Hola " +
                nombre +
                " tu documento es: " + documento  +
                ", tienes " + edad +" años y "+ esMayorEdad() +
                ", tu sexo es " + sexo +
                ", tu peso es " + peso + " kg"+
                " y tu altura es " + altura +" mt"+
                " y segun tu imc tu estado es " + calcularIMC() +
                '}';
    }

    public String esMayorEdad(){

        return this.edad >=18?"Eres mayor de edad":"Eres menor de edad";


    }

    String calcularIMC(){
        double imc = this.peso/Math.pow(this.altura,2);
        return imc < 18.5 ? "Esta bajo de peso" : imc >= 18.5 && imc <= 24.9 ? "Estas melo" : imc >= 25 && imc <= 29.9 ? "Tas relleno" : imc >= 30 && imc <= 39.0 ? "Estas obeso" : "Ni el ejercicio te salva";
    }
}
