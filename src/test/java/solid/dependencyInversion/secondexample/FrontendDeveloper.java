package solid.dependencyInversion.secondexample;

public class FrontendDeveloper implements LanguageImplementation{

    public void writeJavascript(){

    }

    @Override
    public void develop(){
        writeJavascript();
    }

}
