package interface_animal;

public class MainAnimal {
public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    Pato pato = new Pato();
    Gato gato = new Gato();
    System.out.println(cachorro.emitirSom());
    System.out.println(cachorro.comer());
    System.out.println(pato.emitirSom());
    System.out.println(pato.comer());
    System.out.println(gato.emitirSom());
    System.out.println(gato.comer());
}
}
