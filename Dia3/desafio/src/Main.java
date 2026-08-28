// o codigo le um numero, e devolve a quantidade de digitos com uma mensagem, até 5 no máaximo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leONumero = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = leONumero.nextInt();

        if (numero < 9 && numero > 1) {
            System.out.println("O numero digitado tem 1 digito");

        } else if (numero<100 && numero>=10) {
            System.out.println("O numero digitado tem 2 digitos");

        } else if (numero<1000 && numero>= 100) {
            System.out.println("O numero digitado tem 3 digitos");

        } else if (numero<10000 && numero>=100) {
            System.out.println("O numero digitado tem 4 digitos");

        } else if (numero>=10000 && numero>=1000 ) {
            System.out.println("O numero digitado tem 5 digitos");
        }
        else {
            System.out.println("O numero digitado tem 5 ou mais digitos");
        }
    }
}
