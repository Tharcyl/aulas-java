import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {

        // Exercício 01
        double nota01;
        double nota02;
        double media;

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota01 = notas.nextDouble();
        System.out.println("Digite asegunda nota");
        nota02 = notas.nextDouble();

        media = nota01 + nota02 / 2;

        System.out.println("Sua média é: " + media);  
        
    }
}