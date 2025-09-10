package Estudo.heranca.TestHeranca;

import Estudo.heranca.Dominio.Naruto;
import Estudo.heranca.Dominio.Ninja;
import Estudo.heranca.Dominio.Sasuke;

public class MainNinjas {
    public static void main(String[] args) {

        Naruto naruto = new Naruto("Naruto Uzumaki", 17, "Biju", "Uzumaki");


        naruto.imprime();
        naruto.xuriken();
        naruto.muitoChakra();


        Sasuke sasuke = new Sasuke("Sasuke", 18, "Fogo", "Uchiha");


        sasuke.imprime();
        sasuke.Sharringan();
        sasuke.Chidori();


    }

}
