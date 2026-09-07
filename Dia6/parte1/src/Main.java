public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6", 2024, 130_000);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("valor da venda: "+ car.valorVenda());

    }
}
