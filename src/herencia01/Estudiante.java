package herencia01;

public class Estudiante extends Persona{
    private int estado;

    public Estudiante(String nombre, String direccion, String nroTelefono, String correoElectronico, int estado) {
        super(nombre, direccion, nroTelefono, correoElectronico);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+" \n"+ "Estado: "+this.estado;
    }
}
