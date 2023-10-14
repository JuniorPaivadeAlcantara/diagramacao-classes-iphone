package dispositivo;

import browser.WebBrowser;
import music.MediaPlayer;
import phone.Caller;

public class IPhone implements MediaPlayer, Caller, WebBrowser {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba web.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
