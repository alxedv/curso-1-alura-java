import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota= 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.printf("Diga sua avaliação para o %d° filme ou -1 para encerrar. %n", totalDeNotas + 1);
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + media / totalDeNotas);
    }
}
