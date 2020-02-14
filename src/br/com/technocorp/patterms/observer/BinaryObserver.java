package br.com.technocorp.patterms.observer;

import java.util.Observer;

public class BinaryObserver extends X9Observer {

    public BinaryObserver(PizzaSubject pizzaSubject) {
        this.pizzaSubject = pizzaSubject;
        this.pizzaSubject.anexar(this);
    }

    @Override
    public void atualizar() {
        System.out.println("String Binaria " + Integer.toBinaryString(pizzaSubject.getEstado()));
    }

}
