package br.com.meli;

public class Vaca extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Muu");
    }

    @Override
    public void comer() {
        System.out.println("Vaca comendo");
    }
}
