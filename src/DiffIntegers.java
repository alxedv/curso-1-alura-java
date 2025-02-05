import java.util.Scanner;

public class DiffIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int firstInput = scanner.nextInt();

        System.out.println("Agora digite o segundo número:");
        int secondInput = scanner.nextInt();

        if (firstInput != secondInput){
            System.out.println("os números são diferentes");
            if (firstInput > secondInput) {
                System.out.printf("O primeiro número (%d) é MAIOR que o segundo (%d)", firstInput, secondInput);
            } else {
                System.out.printf("O primeiro número (%d) é MENOR que o segundo (%d)", firstInput, secondInput);
            }
        } else {
            System.out.println("Os dois números digitados são iguais!");
        }
    }
}
