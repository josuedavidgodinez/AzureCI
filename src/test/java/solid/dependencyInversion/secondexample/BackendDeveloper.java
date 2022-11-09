package solid.dependencyInversion.secondexample;

public class BackendDeveloper implements LanguageImplementation {

    public void writeJava(){
        System.out.println("El desarrollo se realiza en Java.");
    }

    @Override
    public void develop(){
        writeJava();
    }

}
