package src;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Teste Reprodutor Musical
        iphone.tocarMusica();
        iphone.abrirPlaylist();
        iphone.selecionarMusica("Quão Grande é o meu Deus");

        // Teste Aparelho Telefonico
        iphone.fazerLigacao("0800-4321");
        iphone.abrirContatos();
        iphone.abrirTeclado();
        

        // Teste Navegador de Internet
        iphone.abrirPagina("https://www.google.com.br");
        iphone.atualizarPagina();
        iphone.abrirNovaAba();
    }
}
