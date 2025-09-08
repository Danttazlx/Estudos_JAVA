package Estudo.blocodeinicializacao.domain;

public class Anime {

    private String nome;
    private int[] epsodios  ;

    public int[] getEpsodios() {
        return epsodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
           epsodios [i] = i+1;
        }


        for (int epsodio : this.epsodios)
            System.out.print(epsodio + "  ");

        System.out.println();

    }
}
