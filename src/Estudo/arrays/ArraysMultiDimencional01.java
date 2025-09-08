package Estudo.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysMultiDimencional01 {
    public static void main(String[] args) {

        int[] idade = new int[3];

        idade[0] = 18;
        idade[1] = 20;
        idade[2] = 21;
//        for (int i= 0; i < idade.length ; i++) {
//            System.out.println(idade[i]);


        for (int age : idade) {
            System.out.println(age);
        }


        // preciso printa sala e aluno

        System.out.println("------------------------------------------");

        String[][] escola = new String[2][1];

        escola[0][0] = "sala";
        escola[1][0] = "aluno";

        for (String[] sala : escola) {
            for (String escola01 : sala) {
                System.out.println(escola01);
            }
        }
        System.out.println("------------------------");

        char[][] letra = new char[2][3];

        letra[0][0] = 'D';
        letra[0][1] = 'a';
        letra[0][2] = 'n';

        letra[1][0] = 'i';
        letra[1][1] = 'e';
        letra[1][2] = 'l';


        for (char[] sla : letra) {            // esse for é para acessar o arrayBase
            for (char letra1 : sla) {        // esse for é para acessar o arrayIndex
                System.out.println(letra1);
            }
        }


        System.out.println("------------------------------------------");


        byte[][] numero  = new byte[2][2];

        numero[0][0] = 12;
        numero[0][1] = 12;
        numero[1][0] = 12;
        numero[1][1] = 12;

        for (int d = 0; d < numero.length ; d++) {
            for (int i = 0; i < numero[d].length ; i++) {

                System.out.println(numero[d][i]);

            }
        }

        System.out.println("--------------------------------");
        // esse é um outro jeito de inicializar os arrays

        int[][] array = new int[2][];

        array[0] = new int[]{1,2,3,4,5,6,7,8,9,10 };


        for (int[] sla: array){
            System.out.println("\n-------------");
            for (int sla2: sla){
                System.out.print(sla2);
            }
        }


    }
}