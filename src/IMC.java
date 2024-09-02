import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu peso em Kg; ");
        double peso = ler.nextDouble();

        System.out.print("Digite o seu altura em metros; ");
        double altura = ler.nextDouble();

        double imc = peso/(altura*altura);
        System.out.printf("IMC:  %.2f\n ", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso!");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso!");
        } else {
            System.out.println("Classificação: Obeso!");
        }
    }
}
