package br.com.technocorp.patterms.observer2;

import java.sql.SQLOutput;

public class ObserverPatternsMain2 {

    public static void main(String[] args) {
        MotoboySubject motoboySubject = new MotoboySubject();

        new Patricia(motoboySubject);
        new Jessica(motoboySubject);
        new Gabriel(motoboySubject);

        System.out.println("primeiro estado false\n");
        motoboySubject.setChegouMotoby(true);


    }
}
