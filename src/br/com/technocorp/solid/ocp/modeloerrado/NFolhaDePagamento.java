package br.com.technocorp.solid.ocp.modeloerrado;

public class NFolhaDePagamento {

    protected Double saldo;

    public void Calcular(NFuncionario funcionario) {
        if (funcionario instanceof NContratoClt) {
            this.saldo = ((NContratoClt) funcionario).salario();
        } else if (funcionario instanceof NEstagiario) {
            this.saldo = ((NEstagiario) funcionario).BolsaAuxilio();
        }//else{  this.saldo = ((FuncionarioPj) funcionario).Pagamento(saldo);}


    }

    public static void main(String[] args) {
        NFolhaDePagamento f = new NFolhaDePagamento();
        NContratoClt c = new NContratoClt();

        f.Calcular(c);
        System.out.println(f.saldo);
    }

}
