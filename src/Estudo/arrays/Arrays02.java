package Estudo.arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
         entao antes da gente inicializar algum tipo de dado dentro e um array esse espacos tem algum valores por padrao

         byte, short, int, float, double, long, string

         entao esses tipos, eles tem por padrao valores dentro de um array

       byte,short,long,double, float,int  == 0

       // char "\0000"
       // boolean false
       // Ex: String null    ->  qualquer valor do tipo refence o valor é null //
        */


      String[] nomes = new String[4];

      nomes[1] = " Dantas o Brabo !!";



        System.out.println(nomes[1]);




    }
}
