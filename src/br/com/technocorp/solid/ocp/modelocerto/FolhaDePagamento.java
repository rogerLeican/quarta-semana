package br.com.technocorp.solid.ocp.modelocerto;

public class FolhaDePagamento {


    protected Double saldo;


    public void Calcular(Remuneravel funcionario) {

        this.saldo = funcionario.remuneracao();

    }

    public Double getSaldo() {
        return saldo;
    }


}
