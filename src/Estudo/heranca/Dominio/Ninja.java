package Estudo.heranca.Dominio;

public class Ninja {

    // Apenas para Fixa

    private String nome;
    private int idade;
    private String elemento;
    private String clã;


    public void xuriken(){

        System.out.println("  Xuriken ");

    }
    public Ninja(String nome, int idade, String elemento, String clã) {
        this.nome = nome;
        this.idade = idade;
        this.elemento = elemento;
        this.clã = clã;

        System.out.println("------------------------");

    }


    public Ninja(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }


    public void imprime(){

        System.out.println("Nome: " + nome );
        System.out.println("idade: " + idade );
        System.out.println("elemento: " + elemento);
        System.out.println("clã: " + clã );

    }



}
