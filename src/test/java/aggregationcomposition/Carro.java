package aggregationcomposition;

public class Carro {

    private String marca, modelo;
    private Motor motor;
    private Llanta[] llantas;
    private int contadorLlantas;

    public Carro(String marcaCarro, String modeloCarro, String marcaMotor, int cilindraje) {
        modelo = modeloCarro;
        marca = marcaCarro;
        this.motor = new Motor(cilindraje, marcaMotor);
        this.llantas = new Llanta[4];
        this.contadorLlantas = 0;
    }

    public void agregarLlanta (Llanta nuevaLlanta) {
        if (contadorLlantas < 4) {
            llantas[contadorLlantas] = nuevaLlanta;
            contadorLlantas++;
        }
    }

    public void mostrar(){
        System.out.println("Marca del carro: " + marca);
        System.out.println("Model del carro: " + modelo);
        motor.mostrar();
        for (int i = 0; i < contadorLlantas; i++) {
            llantas[i].mostrar();
        }
    }

}
