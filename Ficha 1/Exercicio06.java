import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double distancia;
        double combustivel;
        double consumoMedio;
        DecimalFormat calc = new DecimalFormat("###,##0.00");

        Scanner ler = new Scanner(System.in);

        System.out.println("Distância: ");
        distancia = ler.nextDouble();

        System.out.println("Combustivel: ");
        combustivel = ler.nextDouble();

        consumoMedio = distancia/combustivel;


        System.out.println("Consumo medio é: " + calc.format(consumoMedio)+" km/l");
    }
}
