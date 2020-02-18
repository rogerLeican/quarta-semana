package br.com.technocorp.patterms.templatemethod;

public class ShakeMorango extends TemplateShakeria {

    public void colocarGelo(){
        System.out.println("colocando gelo para o shake de Morango");
    }


    public void colocarLeite(){
        System.out.println("colocando Leite para o shake de Morango");
    }

    public void colocarSabor(){
        System.out.println("colocando Sabor para o shake de Morango");
    }

    @Override
    public String toString() {
        return "ShakeMorango";
    }
}
