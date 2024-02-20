package nivelamento_1;

public class Atividade2 {
    public static void main(String[] args) {
        int tempoAquecimento = 10;
        int tempoAerobico = 30;
        int tempoMusculacao = 20;

        int caloriasAquecimento = tempoAquecimento * 12;
        int caloriasAerobico = tempoAerobico * 20;
        int caloriasMusculacao = tempoMusculacao * 25;

        int totalMinutosExercicios = tempoAquecimento + tempoAerobico + tempoMusculacao;
        int totalCaloriasPerdidas = caloriasAquecimento + caloriasAerobico + caloriasMusculacao;

        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.%n",
                totalMinutosExercicios, totalCaloriasPerdidas);
    }
}
