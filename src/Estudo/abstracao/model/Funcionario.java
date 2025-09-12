package Estudo.abstracao.model;

public class Funcionario extends Pessoa {

    private double salario;


    public Funcionario(String nome, int idade, double salario) {
        super(nome,idade);
        this.salario = salario;
    }

    @Override
    public void imprime() {

        System.out.println("nome: " + getNome() );
        System.out.println("idade: " + getIdade() );             // ->  tenho que ver se consigo fazer de outra forma esse imprime,mas por hora é isso conseito bem simples
        System.out.println("salario: " + this.salario );

        System.out.println("-------------------------");

    }


}
