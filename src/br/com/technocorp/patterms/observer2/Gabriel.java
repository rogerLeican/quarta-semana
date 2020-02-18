package br.com.technocorp.patterms.observer2;

public class Gabriel extends ThiagoObsever {
    public Gabriel(MotoboySubject motoboySubject) {
        this.motoboySubject = motoboySubject;
        this.motoboySubject.anexar(this);
    }


    @Override
    public void atualizar() {
        System.out.println((motoboySubject.isChegouMotoby()?"Gabriel disse :  Até que enfim!":"Gabriel disse : Já tá pronto?"));
    }
}
