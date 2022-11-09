public class PlanPrepago {

    String nombreDelCliente, numeroDeTelefono;
    int internet, saldo;

    public PlanPrepago(String numeroDeTelefono, String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
        this.numeroDeTelefono = numeroDeTelefono;
        saldo = 100;
        internet = 20;
    }

    public PlanPrepago(String numeroDeTelefono, String nombreDelCliente, int saldo, int internet){

    }

    public int obtenerSaldo() {
        return saldo;
    }

    public void recargarSaldo(int saldoARecargar) {
        saldo = saldoARecargar + saldo;
    }

}
