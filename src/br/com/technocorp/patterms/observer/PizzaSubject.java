package br.com.technocorp.patterms.observer;

import java.util.ArrayList;
import java.util.List;

public class PizzaSubject {

    private List<X9Observer> X9 = new ArrayList<>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
        notificarTodosObservadores();
    }

    public void anexar(X9Observer x9){
       this.X9.add(x9);
    }

    public void notificarTodosObservadores(){
        for (X9Observer observer: X9) {
            observer.atualizar();
        }
    }
}
