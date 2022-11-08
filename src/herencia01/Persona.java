package herencia01;

public class Persona {
    protected String nombre;
    protected String direccion;
    protected String nroTelefono;
    protected String correoElectronico;

    public Persona(String nombre, String direccion, String nroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroTelefono = nroTelefono;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nroTelefono='" + nroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
