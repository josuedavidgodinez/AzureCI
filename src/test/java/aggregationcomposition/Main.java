package aggregationcomposition;

public class Main {

    public static void main(String args[]) {
        Carro hondaCRV = new Carro("Honda", "CRV", "i-VTEC", 2000);

        Llanta llantaFrontalDerecha = new Llanta(1, "Goodyear");
        Llanta llantaFrontalIzquierda = new Llanta(2, "Michelin");

        hondaCRV.agregarLlanta(llantaFrontalDerecha);
        hondaCRV.agregarLlanta(llantaFrontalIzquierda);

        hondaCRV.mostrar();

    }

}
