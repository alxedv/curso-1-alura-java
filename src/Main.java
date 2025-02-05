public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        float notaDoFilme = 8.1f;

        // Media calculada pelas 3 notas da Jack, Paulo e Alex
        double media = (9.8 + 6.3 + 9.0) / 3;
        System.out.println(media);

        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

       /* String texto1 = new String("a");
       String texto2 = new String("a");

       if (texto1 == texto2){
           System.out.println("É igual");
       } else {
            System.out.println("Não é igual!");
        } 8*/

        /*String nome = "Alex";
        int idade = 23;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));*/

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

        // casting implicito
        /* int x = 10;
        double y = x; */

        //casting explicito
        /* double x = 10.5;
        int y = (int) x; */

    }

}