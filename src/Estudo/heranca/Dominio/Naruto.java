package Estudo.heranca.Dominio;

public class Naruto extends Ninja {

    public Naruto(String nome, int idade, String elemento, String clã) {
        super(nome, idade, elemento, clã);
    }

    public void muitoChakra(){
        System.out.println(" Mais Chakra ");
    }



    @Override
    public void xuriken() {
        super.xuriken();
    }



}
