package br.com.technocorp.patterms.templatemethod;

public class ShakeOreo extends TemplateShakeria {


    public void colocarGelo() {
        System.out.println("Colocando Gelo para o Shake de Oreo");
    }


    public void colocarLeite() {
        System.out.println("Colocando Leite para o Shake de Oreo");
    }

    public void colocarSabor() {
        System.out.println("Colocando o Sabor para o Shake de Oreo");
    }

    @Override
    public String toString() {
        return "ShakeOreo";
    }
}
