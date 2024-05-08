package Apps.aparelho;

import Apps.celular.Celular;
import Apps.foleador.Navegador;
import Apps.reprodutor.Reprodutor;

public class AparelhoSmartphone implements Navegador, Reprodutor, Celular{

    @Override
    public void celular() {
        System.out.println("USANDO O CELULAR VIA SMARTPHONE");
    }

    @Override
    public void reproduzir() {
        System.out.println("USANDO O REPRODUTOR VIA SMARTPHONE");
    }

    @Override
    public void navegar() {
        System.out.println("NAVEGANDO VIA SMARTPHONE");
    }

}
