package nivelamento_1;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = sc.nextDouble();


        System.out.print("Digite a quantidade vendida: ");
        int quantidadeVendida = sc.nextInt();


        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = sc.nextDouble();


        sc.close();


        double totalVenda = valorUnitario * quantidadeVendida;


        double troco = valorPago - totalVenda;


        System.out.printf("Seu troco será de R$ %.2f%n", troco);
    }
}
