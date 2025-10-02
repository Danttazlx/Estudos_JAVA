package Estudo.modificadorEstatico;

public class Carro {


    private String nome;
    private int velocidadeMax;
    private static double velocidadeLimite = 250;

     /*
   ao mudar  esse atributo para static é como se esse atributo virasse parte da
    classe ou seja smp que ela for inicializada ela vai ter um "valor" padrao podemos assim dizer
    para todas as instancias Criadas


      */


    public void imprime() {
        System.out.println("-------------------------");

        System.out.println("Nome: " + nome);
        System.out.println("velocidadeMax: " + velocidadeMax);
        System.out.println("VelocidadeLimite: " + Carro.velocidadeLimite);
    }


    public Carro(String nome, int velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public static void setvelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;

    }
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }


}
