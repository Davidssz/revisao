import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a idade do aluno em dias:");
        int idadeEmDias = ler.nextInt();

        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30;
        int dias = (idadeEmDias % 365) % 30;

        System.out.println("Idade do aluno:");
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);

        ler.close();
    }
}