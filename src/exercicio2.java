
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Nome do funcionario.
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = ler.nextLine();

        // Salario fixo.
        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioFixo = ler.nextDouble();

        // Desconto do INSS.
        double descontoINSS;
        if (salarioFixo <= 1412.00) {
            descontoINSS = salarioFixo * 0.075;
        } else if (salarioFixo <= 2666.68) {
            descontoINSS = salarioFixo * 0.09;
        } else if (salarioFixo <= 4000.03) {
            descontoINSS = salarioFixo * 0.12;
        } else {
            descontoINSS = salarioFixo * 0.14;
        }

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Desconto do INSS: R$ " + descontoINSS);
        System.out.println("Salário líquido: R$ " + (salarioFixo - descontoINSS));
    }
}
