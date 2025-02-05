import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int inputNum = scanner.nextInt();

        if (inputNum > 0) {
            System.out.println("Número positivo");
        } else if (inputNum < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("0 é um número neutro");
        }
    }
}
