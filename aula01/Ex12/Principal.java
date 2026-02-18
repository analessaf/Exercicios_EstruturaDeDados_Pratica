import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();
        
        System.out.println("Informe a quantidade de avaliacoes: ");
        int qtdAvaliacoes = sc.nextInt();

        Aluno[] alunos = new Aluno[qtdAlunos];
        double[][] notas = new double[qtdAlunos][qtdAvaliacoes];

        System.out.println(); // pula uma linha

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            sc.nextLine(); // limpar
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Matricula: ");
            int matricula = sc.nextInt();
            
            alunos[i] = new Aluno(nome, matricula);

            for (int j = 0; j < qtdAvaliacoes; j++) {
                System.out.print("Nota da avaliacao " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("--- RELATORIO ACADEMICO ---");
        for (int i = 0; i < qtdAlunos; i++) {
            double soma = 0;
            
            // Soma as notas daquele aluno
            for (int j = 0; j < qtdAvaliacoes; j++) {
                soma += notas[i][j];
            }
            
            double media = soma / qtdAvaliacoes;
            
            System.out.printf("Aluno: %s (Matricula: %d) | Media Final: %.2f\n", alunos[i].nome, alunos[i].matricula, media);
        }

        sc.close();
    }
}