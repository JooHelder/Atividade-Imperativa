import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = ler.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = ler.nextInt();

        int soma = n1 + n2;
        System.out.println("Soma = " + soma);

        int subtracao = n1 - n2;
        System.out.println("Subtração = " + subtracao);

        int multiplicacao = n1 * n2;
        System.out.println("Multiplicação = " + multiplicacao);

        if (n2 != 0){
            int divisao = n1 / n2;
            System.out.println("Divisão = " + divisao);
        }
        else {
            System.out.println("Não é possível dividir por zero.");
        }}}