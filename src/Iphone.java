package src;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String playMusica;
    private String numeroTelefone;
    private String urlPagina;

    @Override
    public void tocarMusica() {
    }

    @Override
    public void abrirPlaylist(){
        }

    @Override
    public void selecionarMusica(String musica) {
        this.playMusica = musica;
        System.out.println("Música selecionada: " + playMusica);
    }


    
    @Override
    public void fazerLigacao(String numero) {
        this.numeroTelefone = numero;
        System.out.println("Ligando para " + numeroTelefone );
    }

    @Override
    public void abrirContatos() {
        
    }

    @Override
    public void abrirTeclado() {
        
    }

    

    @Override
    public void abrirPagina(String url) {
        this.urlPagina = url;
        System.out.println("Abrindo página: " + urlPagina );
    }

    @Override
    public void atualizarPagina() {
        
    }
    
    @Override
    public void abrirNovaAba() {

    }

}
