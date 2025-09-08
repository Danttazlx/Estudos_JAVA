package Estudo.blocodeinicializacao.test;

import Estudo.blocodeinicializacao.domain.Anime;

public class TestBloco {

    public static void main(String[] args) {

        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpsodios());

    }

}


