public class Main {
    public static void main(String[] args) {
        int ingresso = 600;
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
        //
        if (ingresso >= 500)
            terAcesso = "VIP";


        System.out.println(terAcesso);
    }
}
