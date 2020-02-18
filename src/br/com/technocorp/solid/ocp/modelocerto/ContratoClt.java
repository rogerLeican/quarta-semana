package br.com.technocorp.solid.ocp.modelocerto;

public class ContratoClt extends Funcionario implements Remuneravel {

    private double saldo;

    @Override
    public double remuneracao() {
        return saldo = 2000.00;
    }
}
