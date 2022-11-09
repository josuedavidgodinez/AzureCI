package solid.dependencyInversion.secondexample;

import java.util.List;

public class Developer {

    //Implementación Incorrecta

    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    /*public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavascript();
    }*/

    //Implementación correcta
    private LanguageImplementation developersImplementation;

    public Developer(List<LanguageImplementation> developersList){
        this.developersImplementation = (LanguageImplementation) developersList;
    }

    public void implement(){
        developersImplementation.develop();
    }

}
