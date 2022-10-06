import java.util.Scanner;

public class At05 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        valor1 = ler.nextInt();

        System.out.println("Segundo valor: ");
        valor2 = ler.nextInt();

        System.out.println("Terceiro valor: ");
        valor3 = ler.nextInt();

        if (valor1 > valor2 && valor2 > valor3){
            System.out.println(valor1 + ", "+ valor2+ ", "+valor3);
        }else if (valor2 > valor1 && valor1 > valor3){
            System.out.println(valor2 + ", "+ valor1+ ", "+valor3);
        }else if (valor3 > valor1 && valor1 > valor2){
            System.out.println(valor3 + ", "+ valor1+ ", "+valor2);
        }else if (valor1 > valor3 && valor3 > valor2){
            System.out.println(valor1 + ", "+ valor3+ ", "+valor2);
        }else if (valor2 > valor3 && valor3 > valor1){
            System.out.println(valor2 + ", "+ valor3+ ", "+valor1);
        }else if (valor3 > valor2 && valor2 > valor1){
            System.out.println(valor3 + ", "+ valor2+ ", "+valor1);
        }

    }
}
