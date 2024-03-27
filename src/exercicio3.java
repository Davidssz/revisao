import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Nome do funcionário.
        System.out.println("Digite o nome do funcionário:");
        String nome = ler.nextLine();

        // Sálario do funcionário.
        System.out.println("Digite o salário do funcionário:");
        double salario = ler.nextDouble();

        double descontoIRPF = calcularDescontoIRPF(salario);

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Desconto do IRPF: R$" + descontoIRPF);
        System.out.println("Valor líquido:: R$" + (salario - descontoIRPF));
        ler.close();
    }

    public static double calcularDescontoIRPF(double salario) {
        double descontoIRPF = 0;

        if (salario <= 2259.20) {
        
            descontoIRPF = 0;
        } else if (salario <= 2826.65) {
    
            descontoIRPF = salario * 0.075;
        } else if (salario <= 3751.05) {
        
            descontoIRPF = salario * 0.15;
        } else if (salario <= 4664.68) {
        
            descontoIRPF = salario * 0.2255;
        } else {
        
            descontoIRPF = salario * 0.275;
        }
        return descontoIRPF;
    }
}