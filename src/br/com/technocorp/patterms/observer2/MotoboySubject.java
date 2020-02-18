package br.com.technocorp.patterms.observer2;

import java.util.ArrayList;
import java.util.List;

public class MotoboySubject {

    private List<ThiagoObsever> observador = new ArrayList<>();
    private boolean chegouMotoby;


    public boolean isChegouMotoby() {
        return chegouMotoby;
    }

    public void setChegouMotoby(boolean chegouMotoby) {
        this.chegouMotoby = chegouMotoby;
        avisarGeral();
    }

    public void anexar(ThiagoObsever thiagoObsever) {
        this.observador.add(thiagoObsever);
    }

    public void avisarGeral() {
        for ( ThiagoObsever thiagoObsever : observador ) {
            thiagoObsever.atualizar();
        }
    }

}
