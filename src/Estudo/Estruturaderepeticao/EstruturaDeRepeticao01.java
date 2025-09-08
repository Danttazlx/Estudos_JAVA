package Estudo.Estruturaderepeticao;

import java.util.Scanner;

public class EstruturaDeRepeticao01 {

    public static void main(String[] args) {

//      int contar = 1000;
//
//        while(contar > 0){
//            contar--;
//            System.out.println(contar + " TE AMO ELOAHHH");
//        }


        Scanner scanner = new Scanner(System.in);


        int read;
        do {
            System.out.println("qual é sua idade? ");
            read = scanner.nextInt();
        } while (read <= 18);

        scanner.close();

    }
}

