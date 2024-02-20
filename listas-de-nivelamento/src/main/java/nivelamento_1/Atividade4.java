package nivelamento_1;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        // Inicializa o Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Solicita e armazena o nome do usuário
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        // Solicita e armazena as duas notas do usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        // Fecha o Scanner
        sc.close();

        // Calcula a média das notas
        double media = (nota1 + nota2) / 2;

        // Exibe a média
        System.out.printf("Olá, %s. Sua média foi de %.2f%n", nome, media);
    }
}
