import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite um número para visualizar a sua tabuada.");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = i * input;
            System.out.println(String.format("%d x %d = %d", input, i, result));
        }
    }
}
