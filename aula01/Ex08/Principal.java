import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a qtd de linhas e colunas:");
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        
        int[][] mapaInicial = new int[linhas][colunas];
        
        System.out.println("Digite a ocupação inicial da sala:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mapaInicial[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Digite a qtd de assentos para reservar:");
        int qtd = sc.nextInt();

        Assentos cinema = new Assentos(mapaInicial);
        
        int[] resultado = cinema.reservarBloco(qtd);
        
        System.out.println("Resultado da reserva: " + resultado[0] + " " + resultado[1]);
        
        System.out.println("Mapa final da sala:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(mapaInicial[i][j] + " "); 
            }
            System.out.println();
        }
        
        sc.close();
    }
}