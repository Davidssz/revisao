import java.util.Scanner;

public class exercicio1 {

    public static void funcao_teste (){
        // Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        // Variáveis locais
        int num1, num2;

        
        System.out.print("Informe o primeiro número: ");
        num1 = ler.nextInt();

        
        System.out.print("Informe o segundo número: ");
        num2 = ler.nextInt();

        
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2; 
    
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    public static void main(String[] args) {
        funcao_teste();
    }
}
