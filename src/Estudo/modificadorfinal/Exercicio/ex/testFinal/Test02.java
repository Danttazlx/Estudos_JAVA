package Estudo.modificadorfinal.Exercicio.ex.testFinal;

import Estudo.modificadorfinal.Exercicio.ex.dominio.Carro02;

public class Test02 {
    public static void main(String[] args) {


        Carro02 carro = new Carro02();
        Carro02 carro2 = new Carro02();


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
