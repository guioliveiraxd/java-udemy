public class Clients {

    String firistName;
    int age;
    int balance;

    Clients() {
    balance = 10;
    }

    void newAccount() {
        System.out.println(firistName + "Account Created!");
        System.out.println("The new balance is $" + balance);
    }

}
