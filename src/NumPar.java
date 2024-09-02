import java.util.Scanner;

public class NumPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = ler.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Números pares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Números ímpares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
