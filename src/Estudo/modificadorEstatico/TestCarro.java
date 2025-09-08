package Estudo.modificadorEstatico;

public class TestCarro {
    public static void main(String[] args) {

        Carro car1 = new Carro("Fusca", 140);
        Carro car2 = new Carro("BMW", 350);
        Carro car3 = new Carro("UNO", 150);

        car1.setVelocidadeLimite(100);



        car1.imprime();
        car2.imprime();
        car3.imprime();

    }
}
