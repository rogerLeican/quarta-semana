package br.com.technocorp.patterms.observer;

public class ObserverPattermsMain {

    public static void main(String[] args) {

        PizzaSubject pizzaSubject = new PizzaSubject();

        new HexaObserver(pizzaSubject);
        new OctalObserver(pizzaSubject);
        new BinaryObserver(pizzaSubject);

        System.out.println("Primeiro mudança de estado 15 ");
        pizzaSubject.setEstado(15);
        System.out.println("Segunda mudança de estado 10 ");
        pizzaSubject.setEstado(10);

    }


}
