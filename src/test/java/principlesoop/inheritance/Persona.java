package principlesoop.inheritance;

public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private int edadPersona;
    private static int CONTADOR_PERSONA = 0;


    public Persona (int idPersona, String nombre, String apellido, int edadPersona){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edadPersona = edadPersona;
        CONTADOR_PERSONA++;
    }
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edadPersona=" + edadPersona +
                '}';
    }

    public int getCONTADOR_PERSONA() {
        return CONTADOR_PERSONA;
    }
}
