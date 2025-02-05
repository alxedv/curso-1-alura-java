public class Converter {
    public static void main(String[] args) {
        float celsius = 30.9f;
        double farenheit = (celsius * 1.8) + 32;
        System.out.println(farenheit);

        int finalFarenheit = (int)farenheit;
        System.out.println(String.format("A temperatura em Farenheit por inteiro é %d", finalFarenheit));
    }
}
