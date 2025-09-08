package Estudo.sobrecargaDeMetodo.domain;

public class Anime {

    private String nome;
    private int[] epsodios = new int[10];

    public Anime() {
        System.out.println(epsodios);
    }
}
