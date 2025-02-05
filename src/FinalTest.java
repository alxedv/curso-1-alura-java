import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(" ");

        double balance = 2000;
        String text = """
                Nome:           Alex Maia
                Tipo de conta:  Corrente
                Saldo Inicial:  R$""" + balance;
        System.out.println(text);
        System.out.println("*****************************************");

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 4){
            System.out.println("Operações");
            String menuText = """
                    1- Consultar Saldos
                    2- Receber Valor
                    3- Transferir Valor
                    4- Sair
                    """;
            System.out.println(menuText);
            option = scanner.nextInt();
            if (option > 4) {
                System.out.println("Opção inválida! Digite uma das opções acima.");
            }

            switch(option){
                case 1:
                    System.out.println("O seu saldo atual é de R$" + balance);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    balance += scanner.nextInt();
                    System.out.println("Saldo atualizado de R$" + balance);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    int transferValue = scanner.nextInt();
                    if (transferValue < balance) {
                        balance -= transferValue;
                        System.out.println("O saldo atualizado é de R$" + balance);
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    }
                    break;
            }
        }
    }
}
