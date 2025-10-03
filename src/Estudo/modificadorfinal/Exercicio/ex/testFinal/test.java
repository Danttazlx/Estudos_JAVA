package Estudo.modificadorfinal.Exercicio.ex.testFinal;

import Estudo.modificadorfinal.Exercicio.ex.dominio.Carro01;

public class test {
    public static void main(String[] args) {

        Carro01 carro = new Carro01(); // correto por se tratar de de um modificador statico usar a class e nao a varialvel de referencia

        System.out.println(carro.velocidadeLimite);

        /*  carro.velocidadeLimite = voce nao consegue

        pode perceber que ela nao permite atribuir outro valor dentro dela, porque pq é um modificador final
        valor tera que ser dado na hora que vc cria o modificador final e por obrigatoriedade vc colocar ou atribuir o valor ao seu modificador.



         */


    }
}
    