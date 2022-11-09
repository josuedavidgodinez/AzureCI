package solid.singleResponsability;

public class singleResponsabilityRunner {

    public static void main(String args[]) {

        Area areaObj = new Area();
        Volumen volumenObj = new Volumen();

        areaObj.calcularArea();
        volumenObj.calcularVolumen();

        IncorrectSingleResponsability wrongSingleResponsability = new IncorrectSingleResponsability();

        wrongSingleResponsability.calcularArea();
        wrongSingleResponsability.calcularVolumen();

    }

}
