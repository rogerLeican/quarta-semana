package br.com.technocorp.solid.ocp.modelocerto;

public class Estagiario extends Funcionario implements Remuneravel  {

    private double saldo;

    @Override
    public double remuneracao() {
        return saldo = 1000.00;
    }
}
