package principlesoop.inheritance;

public class Empleado extends Persona {

    private int idEmpleado;
    private int sueldo;

    public Empleado(int idPersona, String nombre, String apellido, int edadPersona, int idEmpleado, int sueldo) {
        super(idPersona, nombre, apellido, edadPersona);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
