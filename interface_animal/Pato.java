package interface_animal;



public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "Quack";
    }
    public String comer(){
        return "Pato comendo";
    }
}

