package Estudo.modificadorfinal.Exercicio.ex.dominio;

public class Carro {

    private String nome;
    private String modelo;
    public final double VELOCIDADEMIN = 250 ;


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
