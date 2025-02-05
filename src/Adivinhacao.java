import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = new Random().nextInt(100);
        int inputNum = 0;

        System.out.println("Seja bem vindo ao jogo de Adivinhação");
        System.out.println("Tente adivinhar qual o número secreto da vez!!!");


        while(inputNum != randomNum){
            System.out.println("Qual o seu chute?");
            inputNum = scanner.nextInt();
            if (inputNum < randomNum) {
                System.out.println("O número que você digitou é MENOR do que o número secreto.");
            } else if (inputNum > randomNum) {
                System.out.println("O número que você digitou é MAIOR do que o número secreto.");
            } else {
                break;
            }
        }

        System.out.println("Parabéns, você acertou!!!");
    }
}
