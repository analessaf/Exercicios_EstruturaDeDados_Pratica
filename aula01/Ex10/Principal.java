import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][8];
        
        System.out.println("Digite os dados da agenda:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        AgendaSemanal agenda = new AgendaSemanal(matriz);
        System.out.println("Horarios livres: " + agenda.contarHorariosLivres());
        
        sc.close();
    }
}