package smartphone;

import Apps.aparelho.AparelhoSmartphone;
import Apps.celular.Celular;
import Apps.celular.CorreioVoz;
import Apps.celular.Telefone;
import Apps.foleador.Navegador;
import Apps.reprodutor.Reprodutor;

public class Smartphone {

    public static void main(String[] args) {

        AparelhoSmartphone ap = new AparelhoSmartphone();
        
        Celular celular = ap;
        Navegador navegador = ap;
        Reprodutor reprodutor = ap;
        

        celular.celular();
        navegador.navegar();
        reprodutor.reproduzir();


    }
        
}
