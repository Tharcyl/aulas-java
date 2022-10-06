import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class At03 {
    public static void main(String[] args) {
        String nome;
        double salario;
        double totalVendasMes;
        double totalReceber;
        DecimalFormat calc = new DecimalFormat("###,###.00");

        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do vendedor: ");
        nome = ler.next();

        System.out.println("Salario fixo do vendedor: ");
        salario = ler.nextDouble();

        System.out.println("Total de vendas efetuadas no mês: ");
        totalVendasMes = ler.nextDouble();

        totalReceber =  salario + (totalVendasMes * 0.15);

        System.out.println("Total: " + (calc.format(totalReceber)));
    }
}
