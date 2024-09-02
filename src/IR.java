import java.util.Scanner;

public class IR {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu salário bruto em R$: ");
        double sal = ler.nextDouble();

        double imposto = 0.0;

        if (sal <= 2640.00) {
            imposto = 0.0; // Isento
        } else if (sal <= 4400.00) {
            imposto = (sal - 2640.00) * 0.075;
        } else if (sal <= 6500.00) {
            imposto = (4400.00 - 2640.00) * 0.075 + (sal - 4400.00) * 0.15;
        } else {
            imposto = (4400.00 - 2640.00) * 0.075 + (6500.00 - 4400.00) * 0.15 + (sal - 6500.00) * 0.225;
        }
        System.out.println("R$ " + String.format("%.2f", imposto));
    }
}
