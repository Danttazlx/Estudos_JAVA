package Estudo.abstracao.model;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

               // aq so criamos a casca, nas SubClass que a gente define

    public abstract void imprime();


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
