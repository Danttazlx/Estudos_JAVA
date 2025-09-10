package Estudo.heranca.Dominio;

public class Sasuke extends Ninja {


    public Sasuke(String nome, int idade, String elemento, String clã) {
        super(nome, idade, elemento, clã);
    }


    public void Chidori () {
        System.out.println("chidori");
    }

    public void  Sharringan(){
        System.out.println("Sharringan Sasuke");
    }

    @Override
    public void imprime() {
        super.imprime();
    }
}
