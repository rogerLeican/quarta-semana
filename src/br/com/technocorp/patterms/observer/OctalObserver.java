package br.com.technocorp.patterms.observer;

public class OctalObserver  extends X9Observer{

    public OctalObserver(PizzaSubject pizzaSubject) {
        this.pizzaSubject = pizzaSubject;
        this.pizzaSubject.anexar(this);
    }

    @Override
    public void atualizar() {
        System.out.println("String Octal " + Integer.toOctalString(pizzaSubject.getEstado()));
    }
}
