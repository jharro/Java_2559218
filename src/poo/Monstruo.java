package poo;

public class Monstruo {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private float velocidad;
    float altura;
    float fuerza;
    String color;
    int nroManos;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public float getAltura() {
        return altura;
    }

    public float getFuerza() {
        return fuerza;
    }

    public String getColor() {
        return color;
    }

    public int getNroManos() {
        return nroManos;
    }
//MÉTODOS

    //1. Método constructor
    Monstruo(String nombre,int edad, float vel, float altura, float fuerza,
             String color,int nroManos){
        this.nombre = nombre;
        this.edad = edad;
        this.velocidad = vel;
        this.altura=altura;
        this.fuerza=fuerza;
        this.color=color;
        this.nroManos=nroManos;

    }
    Monstruo(){

    }
//2. Métodos getter

    /*public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public float getVelocidad(){
        return velocidad;
    }
    public float getAltura(){
        return altura;
    }
    public float getFuerza(){
        return fuerza;
    }
    public String getColor(){
        return color;
    }

    public int getNroManos(){
        return nroManos;
    }*/
//3. Métodos setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad>0){
        this.edad = edad;}
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNroManos(int nroManos) {
        this.nroManos = nroManos;
    }

    void volar(){
        System.out.println("El monstruo está volando");
    }

    void caminar(){

    }
    void comer(){

    }
    void respirarEnElEspacio(){

    }
    //Método toString



    @Override
    public String toString() {
        return "Los datos de mi objeto son\n" +
                "nombre='" + nombre + '\n' +
                ", edad=" + edad + '\n'+
                ", velocidad=" + velocidad +
                ", altura=" + altura +
                ", fuerza=" + fuerza +
                ", color='" + color + '\'' +
                ", nroManos=" + nroManos +
                '}';
    }
}
