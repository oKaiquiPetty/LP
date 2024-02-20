package nivelamento_1;

public class Atividade1 {
    public static void main(String[] args) {
        int filhos0a3 = 2; // Número de filhos de 0 a 3 anos
        int filhos4a16 = 3; // Número de filhos de 4 a 16 anos
        int filhos17a18 = 1; // Número de filhos de 17 a 18 anos

        // Calcula o valor da bolsa para cada faixa etária
        double valor0a3 = filhos0a3 * 25.12;
        double valor4a16 = filhos4a16 * 15.88;
        double valor17a18 = filhos17a18 * 12.44;

        // Calcula o total de filhos e o valor total da bolsa
        int totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;
        double valorTotalBolsa = valor0a3 + valor4a16 + valor17a18;

        // Exibe a frase com o resultado
        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa%n", totalFilhos, valorTotalBolsa);
    }
}
