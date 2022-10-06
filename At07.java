import java.util.Scanner;

public class At07 {
    public static void main(String[] args) {
        int notas100;
        int valor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valor = ler.nextInt();

        if (valor > 100){
            int num = valor / 100;

            valor = valor - (num * 100);
        }

        System.out.println("notas de 100");
    }
}
