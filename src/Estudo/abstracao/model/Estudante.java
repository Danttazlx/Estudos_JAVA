package Estudo.abstracao.model;

import java.util.NoSuchElementException;

public class Estudante extends Pessoa {

    private double alunoNota;

    public Estudante(String nome, int idade,double alunoNota) {
        super(nome, idade);
        this.alunoNota = alunoNota;

    }

    public void setAlunoNota(double alunoNota) {
        this.alunoNota = alunoNota;
    }

    @Override
    public void imprime() {
        System.out.println("nome: " + getNome() );
        System.out.println("idade: " + getIdade() );
        System.out.println("NotaDoAluno: " + this.alunoNota);

    }
}
