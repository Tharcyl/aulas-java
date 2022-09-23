import java.util.Scanner;

public class At02 {
    public static void main(String [] args){
        double numFuncionario;
        double horasTrabalhadas;
        double salarioHora;
        double resultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario");
        numFuncionario = in.nextDouble();
        System.out.println("Digite o valor da hora: ");
        salarioHora = in.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas");
        horasTrabalhadas = in.nextDouble();

        resultado = horasTrabalhadas * salarioHora;

        System.out.println("Numero do funcionario: " + numFuncionario);
        System.out.println("Valor a ser recebido:" + resultado);
        
    }
}
