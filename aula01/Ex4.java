import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a qtd de alunos? ");
        int alunos = sc.nextInt();
        System.out.println("Digite a qtd de provas? ");
        int provas = sc.nextInt();
        double[][] boletim = new double[alunos][provas];

        System.out.println("Digite a nota do aluno? ");
        for (int i = 0; i < alunos; i++){
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < provas; j++) {
                boletim[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < alunos; i++){
            double soma = 0;
            double media = 0;
            for (int j = 0; j < provas; j++) {
                soma = soma + boletim[i][j];
                media = soma / provas;
            }
            System.out.println("Aluno " + (i + 1) + " media: " + media);
        } 

    }   
}
