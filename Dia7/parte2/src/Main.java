import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite a operacao (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        if (operacao == '+') {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (operacao == '-') {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (operacao == '*') {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (operacao == '/') {
            if (n2 != 0) {
                System.out.println("Resultado: " + (n1 / n2));
            } else {
                System.out.println("Nao e possivel dividir por zero.");
            }
        } else {
            System.out.println("Operacao invalida.");
        }
    }
}