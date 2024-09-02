import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = ler.nextInt();

        if (num < 0){
            System.out.println("O número deve ser inteiro e positivo");
        } else{
            int fatorial = 1;
            int i = 1;

            while (i <= num){
                fatorial *= i;
                i++;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }
    }
}
