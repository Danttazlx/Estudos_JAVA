package Estudo.Estruturaderepeticao;

public class EstruturaDeRepeticaoEx02 {
    public static void main(String[] args) {

        // imprima todos os numeros pares ate 1000


//        for (int i = 0; i <= 1000000 ; i++) {
//            System.out.println(i++);


        int num = 0;


        do {


            if (num % 2 == 0) {
                System.out.println(num);
            }


        } while (++num <= 100);


    }
}

