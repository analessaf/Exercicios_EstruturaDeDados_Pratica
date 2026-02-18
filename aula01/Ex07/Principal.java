import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite qtd de alunos: ");
        int n = sc.nextInt();
        System.out.println("Digite qtd de provas: ");
        int m = sc.nextInt();
        double[][] matrizDoMain = new double[n][m];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                matrizDoMain[i][j] = sc.nextDouble();
            }
        }
        
        Boletim boletim = new Boletim (matrizDoMain);
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Media aluno %d: %.2f\n", (i + 1), boletim.mediaAluno(i));
        }
        
        for (int j = 0; j < m; j++) {
            System.out.printf("Media prova %d: %.2f\n", (j + 1), boletim.mediaProva(j));
        }
        
        sc.close();
    }
}
    
