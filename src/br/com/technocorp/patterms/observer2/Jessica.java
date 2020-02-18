package br.com.technocorp.patterms.observer2;

public class Jessica extends ThiagoObsever{

    public Jessica(MotoboySubject motoboySubject) {
        this.motoboySubject = motoboySubject;
        this.motoboySubject.anexar(this);
    }


    @Override
    public void atualizar() {
        System.out.println((motoboySubject.isChegouMotoby()?"Jessica disse : Eu tava com muita fome":"Jessica disse :To com fome!!"));
    }
}
