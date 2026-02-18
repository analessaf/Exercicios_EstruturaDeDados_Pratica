import java.util.*;

public class Ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos num quer digitar? ");
        int qtd = sc.nextInt();
        int sensor[] = new int [qtd];

        for (int i = 0; i < qtd; i++){
            sensor[i] = sc.nextInt();
        }

        int valor = sensor[0];
        int cont = 0;
        int par = 0;
        for (int i = 0; i < qtd; i++){
            if (valor == sensor[i]){
                cont++;
            }else{
                par++;
                System.out.println("("+valor+", "+cont+")");
                valor = sensor[i];
                cont = 1;
            }
        }
        System.out.println("("+valor+", "+cont+")");
        System.out.println("\nPAR: " + (++par));
    }

}