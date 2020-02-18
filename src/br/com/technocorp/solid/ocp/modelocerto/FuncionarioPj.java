package br.com.technocorp.solid.ocp.modelocerto;

import br.com.technocorp.solid.ocp.modeloerrado.NFuncionario;

public class FuncionarioPj extends NFuncionario implements Remuneravel {

    private double saldo;

    @Override
    public double remuneracao() {
        return saldo = 4500.00;
    }
}
