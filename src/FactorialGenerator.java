import java.util.Scanner;

public class FactorialGenerator {
    public static void main(String[] args) {
        System.out.println("Digite um número e vamos calcular o fatorial dele");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int result = input;
        String factorial = input + " X ";

        for (int i = input - 1; i != 1; i--) {

            result *= i;
            factorial += i + " X ";        }

        System.out.println(factorial + "1 = " + result );
    }
}
