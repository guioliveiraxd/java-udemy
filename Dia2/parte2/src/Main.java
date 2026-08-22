import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        cars[2] = "Ferrari";
        if(cars[2] == "Ferrari") {cars[2] = "Jeep";}
        while(cars[2] == "Jeep") {cars[2] = cars[0];}

        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);

    }
}
