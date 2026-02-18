import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Quantos codigos quer digitar? ");
      int qtd = sc.nextInt();
      int sensor[] = new int [qtd];
      int unicos[] = new int [qtd];
      int tamanhoFinal = 0;

      System.out.println("Digite os codigos: ");
        for (int i = 0; i < qtd; i++){
            sensor[i] = sc.nextInt();
            boolean repetido = false;
            for (int j = 0; j < tamanhoFinal; j++) {
                if (sensor[i] == unicos[j]){
                    repetido = true;
                    break;
                }
            } 
            if (repetido == false){
                unicos[tamanhoFinal] = sensor[i];
                tamanhoFinal++;
            } 
        } 
        System.out.println("Tamanho Final: " + tamanhoFinal);
        System.out.print("Unicos: ");
        for (int i = 0; i < tamanhoFinal; i++){
            System.out.print(unicos[i] + " ");
        }

        System.out.println();
        sc.close();
   }
}