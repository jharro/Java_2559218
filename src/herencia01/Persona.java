package herencia01;

public class Persona {
    private String nombre;
    private String direccion;
    private String nroTelefono;
    private String correoElectronico;

    public Persona(){

    }
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
