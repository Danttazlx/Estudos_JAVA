package Estudo.modificadorfinal.exercicio02.domain;

public class Carro {

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
