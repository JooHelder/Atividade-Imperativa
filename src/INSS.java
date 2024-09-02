import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu salário em R$: ");
        double sal = ler.nextDouble();

        double contribuicaoINSS = 0.0;

        if (sal <= 1320.00) {
            contribuicaoINSS = sal * 0.075;
        } else if (sal <= 2640.00) {
            contribuicaoINSS = 1320.00 * 0.075 + (sal - 1320.00) * 0.09;
        } else if (sal <= 3960.00) {
            contribuicaoINSS = 1320.00 * 0.075 + (2640.00 - 1320.00) * 0.09 + (sal - 2640.00) * 0.12;
        } else {
            contribuicaoINSS = 1320.00 * 0.075 + (2640.00 - 1320.00) * 0.09 + (3960.00 - 2640.00) * 0.12 + (sal - 3960.00) * 0.14;
        }

        double salLiquido = sal - contribuicaoINSS;

        System.out.printf("Valor da contribuição ao INSS: R$ %.2f\n", contribuicaoINSS);
        System.out.printf("Salário líquido: R$ %.2f\n", salLiquido);
    }
}
