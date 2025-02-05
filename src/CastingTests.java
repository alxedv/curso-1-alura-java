public class CastingTests {
    public static void main(String[] args) {
        double myDouble = 3.4;
        int myInt = (int) myDouble;

        char myChar = 'A';
        String myString = "lex";
        System.out.println(myChar + myString);

        double precoProduto = 29.90;
        int quantidade = 4;
        double total = precoProduto * quantidade;
        System.out.println("O valor total é: " + total);

        double valorEmDolares =  53.9;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares / cotacao;
        System.out.println(String.format("O valor em dolares de  $%.2f equivale a R$%.2f", valorEmDolares, valorEmReais));

        double precoOriginal = 123.40;
        int percentualDesconto = 37;
        double descontoEmReais = (precoOriginal * percentualDesconto) / 100;
        double precoFinal = precoOriginal - descontoEmReais;
        System.out.println(String.format("O tenis esta com um desconto de %d%%" + " e sai de R$%.2f para R$%.2f", percentualDesconto, precoOriginal, precoFinal));

    }
}
