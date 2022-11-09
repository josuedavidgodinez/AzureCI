package principlesoop.inheritance;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date date;

    public Cliente(int idPersona, String nombre, String apellido, int edadPersona, int idCliente) {
        super(idPersona, nombre, apellido, edadPersona);
        this.idCliente = idCliente;
        date = new Date();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cliente{" +
                "idCliente=" + idCliente +
                ", date=" + date +
                '}';
    }
}
