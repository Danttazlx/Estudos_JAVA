package Estudo.arrays;

public class ArrayCmFor {
    public static void main(String[] args) {

        /*

              copmo imprimir todos dentro do array


         */


        String[] nomes = new String[5];

        nomes[0] = "Dantas";
        nomes[1] = "Dantas";
        nomes[2] = "Dantas";
        nomes[3] = "Dantas";
        nomes[4] = "4- Dantas";


        for (String Nome: nomes){               // essa aq é uma outra forma de fazer, ele cria uma nova variavel que faz referencia para
                                                // o array nomes dps ele printa a varial de criacao que vc criou e acessa como se fosse length
            System.out.println(Nome);

        }




//        for (int i = 0; i < nomes.length ; i++) {          // ->   aq eu tentei colocar <4 porem o indix vai ate 2 ou seja tem que ser 3 <3 que no caso seria 2
//
//            System.out.println(nomes[i]);
//
//        }




    }
}
