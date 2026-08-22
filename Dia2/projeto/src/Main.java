import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println(Arrays.toString(my_array1));

        // 1. Ordena e imprime o array numérico (ordem crescente)
        Arrays.sort(my_array1);
        System.out.println("Array numérico ordenado: " + Arrays.toString(my_array1));


        System.out.println(Arrays.toString(my_array2));

        // 2. Ordena e imprime o array de Strings (ordem alfabética)
        Arrays.sort(my_array2);
        System.out.println("Array de texto ordenado: " + Arrays.toString(my_array2));
    }
}