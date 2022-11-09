package solid.dependencyInversion.correct;

import java.util.ArrayList;
import java.util.List;

public class RunnerDependencyInversion {

    public static void main(String[] args){
        List<Empleado> empleadoArrayList =  new ArrayList<>();

        Ingenieria ingenieria = new Ingenieria();
        empleadoArrayList.add(ingenieria);

        Ventas ventas = new Ventas();
        empleadoArrayList.add(ventas);

    }

}
