package Estudo.modificadorfinal;

public class Carro {

/*
modificador final é uma contasnte e uma palavra reservada, e por se tratar de uma constante o JAVA tem uma convencao para ela
do nome dela ser em Maiusculo e casos de espacos o uso de __ para que quando vc encontrar vc bate o olho e ver que é um modificador final
VELOCIDADE_ LIMITE, depois disso, lembra que por ser final nao muda independente, e ele em maioria das vezes vem acopanhado do modificador static

voce precisa dar o valor dela spm, e nao podera mexelo dpois

 */


    private String nome;
    public final double velocidadeLimite = 250;

//    {
//       velocidadeLimite = 250;    -> poderia fazer assim tambem, porque o bloco static sempre sera inicializado primeiro
//    }


//    public Carro() {
//        velocidadeLimite = 250;
//    }


    public String getNome() {
        return nome;
    }



}
