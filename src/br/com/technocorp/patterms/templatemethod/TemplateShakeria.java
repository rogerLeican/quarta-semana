package br.com.technocorp.patterms.templatemethod;

import java.security.PublicKey;

public abstract class TemplateShakeria {

    public abstract void colocarLeite();

    public abstract void colocarGelo();

    public abstract void colocarSabor();

    public void PrepararShake() {

        colocarGelo();

        colocarLeite();

        colocarSabor();

        System.out.println("Pronto! Está servido seu delicioso shake de " + TemplateShakeria.this + " !!");

    }


}
