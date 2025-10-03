package Estudo.modificadorfinal.Exercicio.ex.dominio;

public class Carro02 {

    private  String nome;
    public static final double VELOCIDADE_LIMITE = 280;
    public final Comprador COMPRADOR = new Comprador();





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
}
