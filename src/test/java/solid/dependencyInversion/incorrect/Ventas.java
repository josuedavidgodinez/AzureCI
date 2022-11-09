package solid.dependencyInversion.incorrect;

public class Ventas {

    public int vender(int i){
        if(i ==1){
            return 1;
        }
        System.out.println("vender");
        return 0;
    }

}
