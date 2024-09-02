import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = ler.nextInt();

        // Exibindo a tabuada do número fornecido
        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
