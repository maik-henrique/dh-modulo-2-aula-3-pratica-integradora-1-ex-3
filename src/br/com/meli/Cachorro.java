package br.com.meli;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo");
    }
}
