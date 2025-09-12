package Estudo.abstracao.testMain;

import Estudo.abstracao.model.Estudante;
import Estudo.abstracao.model.Funcionario;
import Estudo.abstracao.model.Pessoa;

public class Main {
    public static void main(String[] args) {

//        Pessoa p = new Pessoa();    -> classes abstratas nao podem ser instanciadas

        Funcionario funcionario = new Funcionario("Joao", 27, 2000);

        funcionario.imprime();

        Estudante estudante = new Estudante("Dantas", 19, 10);
        estudante.imprime();


    }
}