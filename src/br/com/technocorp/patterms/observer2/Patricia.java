package br.com.technocorp.patterms.observer2;

public class Patricia extends ThiagoObsever {

    public Patricia(MotoboySubject motoboySubject) {
        this.motoboySubject = motoboySubject;
        this.motoboySubject.anexar(this);
    }


    @Override
    public void atualizar() {
        System.out.println((motoboySubject.isChegouMotoby()?"Patricia disse : Tava na hora Baralho!!":"Patricia disse :Poxa Caranba!!"));
    }
}
