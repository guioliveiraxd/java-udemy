public class Main {
    public static void main(String[] args) {
        int valorCarro = 99_000;
        if (valorCarro > 100_000) {
            System.out.println("Nao comprar. Acima da tabela");

        }
        else if (valorCarro >= 90_000 && valorCarro <=100_000) {
            System.out.println("Comprar o carro");

        }
        else
            System.out.println("Nao comprar. valor a baixo da tabela");

    }
}
