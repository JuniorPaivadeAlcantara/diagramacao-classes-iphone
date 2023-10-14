import dispositivo.IPhone;

public class Main {
    public static void main(String[] args){
        IPhone telephone = new IPhone();

        telephone.ligar();
        telephone.atender();
        telephone.iniciarCorreioVoz();
        telephone.selecionarMusica();
        telephone.tocar();
        telephone.pausar();
        telephone.exibirPagina();
        telephone.adicionarNovaAba();
        telephone.atualizarPagina();
    }
}
