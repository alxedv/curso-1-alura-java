import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota= 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Diga sua avaliação para o %d° filme: %n", i + 1);
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Média de avaliações: " + media / 3);
    }
}
