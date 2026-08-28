public class Main {
    public static void main(String[] args) {
        boolean temEmprego = true;
        boolean temEmpresa = false;
        boolean tem50k = true;
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;

        System.out.println(podeFinanciar);



    }
}
