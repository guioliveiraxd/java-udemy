import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nmero");
        int numero1 = numero1Scanner.nextInt();

        Scanner numero2Scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nmero");
        int numero2 = numero2Scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("O resultado e: " + resultado);


    }
}
