package br.com.technocorp.patterms.observer;

public class HexaObserver extends X9Observer {

    public HexaObserver(PizzaSubject pizzaSubject) {
        this.pizzaSubject = pizzaSubject;
        this.pizzaSubject.anexar(this);
    }

    @Override
    public void atualizar() {
        System.out.println("String Octal " + Integer.toHexString(pizzaSubject.getEstado()).toUpperCase() );
    }

}
