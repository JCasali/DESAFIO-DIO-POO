package src;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Teste Reprodutor Musical
        iphone.tocarMusica();
        iphone.abrirPlaylist();
        iphone.selecionarMusica("O Melhor Lugar do Mundo");

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
