package Estudo.condicional;

import java.util.Scanner;

public class ExSwift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha de 1 a 7");
        Byte escolha = scanner.nextByte();


        switch (escolha) {

            case 1:
                System.out.println(" Domingo final de semana");
                break;
            case 2:
                System.out.println("seg dia util");
                break;
            case 3:
                System.out.println("ter dia util");
                break;
            case 4:
                System.out.println("quar dia util");
                break;
            case 5:
                System.out.println("quin dia util");
                break;
            case 6:
                System.out.println("sex dia util");
                break;
            case 7:
                System.out.println("sab final de samana");
            default:
                System.out.println("Escolha o Numero De 1 a 7 !");
        }
        scanner.close();


    }
}
