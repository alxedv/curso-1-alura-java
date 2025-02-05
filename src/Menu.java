import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a melhor calculadora do mundo!");
        System.out.println("Escolha a opção que deseja calcular:");
        System.out.println("1 - Calcular área do quadrado");
        System.out.println("2 - Calcular área do círculo");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Digite a medida em metros de um dos lados do quadrado: ");
            int squareSide = scanner.nextInt();
            System.out.println("A área do quadrado é: " + squareSide * squareSide + "m²");
        } else if (option == 2) {
            System.out.println("Digite a medida em metros do raio: ");
            int radius = scanner.nextInt();
            double result = 3.14 * (radius * radius);
            System.out.println("A área do círculo é: " + result + "m²");
        }
    }
}
