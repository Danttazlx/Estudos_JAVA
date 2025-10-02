package Estudo.modificadorfinal.exercicio02;

import Estudo.modificadorfinal.exercicio02.domain.Carro;
import Estudo.modificadorfinal.exercicio02.domain.Comprador;

public class Test02 {
    public static void main(String[] args) {


        Carro carro = new Carro();
        Carro carro2 = new Carro();


        /*
        aqui voce nao seta pelo objeto carro, vc cria a referencia para a class COMPRADOR
        dentro da class carro, entao como sao objetos que se
        conecta, vc instancia apenas um e acessa os valores do outro

         */

        carro.COMPRADOR.setNome("Dantas");
        carro2.COMPRADOR.setNome("Dantas");
        System.out.println(carro.COMPRADOR);
        System.out.println(carro2.COMPRADOR);








    }
}
