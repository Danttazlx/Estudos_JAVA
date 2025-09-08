package Estudo.acoplamento.test;

import Estudo.acoplamento.domain.Estudante;

public class TestEstudante {
    public static void main(String[] args) {


        Estudante estudante = new Estudante();

        estudante.setNome("Dantinhas");
        estudante.setIdade(19);
        estudante.setSexo('M');


        estudante.imprime();

    }
}
