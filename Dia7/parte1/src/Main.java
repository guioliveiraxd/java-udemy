import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (n % 2 == 1) {
            System.out.println("impar");
        } else {
            if (n >= 2 && n <= 5)
                System.out.println("A");
            else if (n >= 6 && n <= 20)
                System.out.println("B");
            else
                System.out.println("C");
        }
    }
}