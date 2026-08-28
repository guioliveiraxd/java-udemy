import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat dolar = NumberFormat.getCurrencyInstance();
        String productValue = dolar.format(120.80);



        System.out.println(productValue);
    }
}
