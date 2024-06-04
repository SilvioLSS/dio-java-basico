package Dispositivos;

public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando ReprodutorMusical
        meuIphone.getReprodutorMusical().selecionarMusica("Imagine - John Lennon");
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().pausar();

        // Testando AparelhoTelefonico
        meuIphone.getAparelhoTelefonico().ligar("123-456-7890");
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.getNavegadorInternet().exibirPagina("http://www.example.com");
        meuIphone.getNavegadorInternet().adicionarNovaAba();
        meuIphone.getNavegadorInternet().atualizarPagina();
    }
}
