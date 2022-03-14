package br.com.meli;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal vaca = new Vaca();
        List<Animal> animais = List.of(gato, cachorro, vaca);
        animais.forEach(animal -> {
            animal.comer();
            animal.emitirSom();
        });
    }
}
