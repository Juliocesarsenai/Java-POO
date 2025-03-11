package interface_animal;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "Au au";
    }
    public String comer(){
        return "Cachorro comendo";
    }
}
