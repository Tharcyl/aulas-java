import java.util.Scanner;

public class At04 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = ler.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = ler.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = ler.nextInt();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("MAIOR: "+ valor1);
        }else if (valor2 > 3){
            System.out.println("MAIOR: "+ valor2);
        }else {
            System.out.println("MAIOR: "+ valor3);
        }

        if (valor1 < valor2 && valor1 < valor3){
            System.out.println("MENOR: "+ valor1);
        }else if (valor2 < 3){
            System.out.println("MENOR: "+ valor2);
        }else {
            System.out.println("MENOR: "+ valor3);
        }
    }
}
