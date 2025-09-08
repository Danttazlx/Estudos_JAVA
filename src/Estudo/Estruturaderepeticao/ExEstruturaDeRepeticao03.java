package Estudo.Estruturaderepeticao;

import java.util.Scanner;

public class ExEstruturaDeRepeticao03 {
    public static void main(String[] args) {
        // dado o valor de um carro, ve=ja em quantas vezes pode ser parcelar
        // com a par6cela de 1000 reais ou seja se custar 10000, o valor da parcela tem que ser 1000


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double valorDoCarro = sc.nextInt();


        for (int parcela = 1; parcela <= valorDoCarro ; parcela++) {
            int parcelasSeremPagas = (int) valorDoCarro / parcela;

          if (parcelasSeremPagas >= 1000){
              System.out.println( parcela + ",R$ " + parcelasSeremPagas);
          }
        }




        }

}
