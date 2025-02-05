import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Digite um número e vamos verificar se ele é PAR ou IMPAR.");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.printf("O número %d é PAR", input);
        } else {
            System.out.printf("O número %d é IMPAR", input);
        }

    }
}
