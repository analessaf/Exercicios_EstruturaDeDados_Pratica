import java.util.*;
public class Ex0 {
    public static void main (String[] args){
        float[] notas = new float[5];

        float media = 0;
        float soma = 0;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            notas[i] = sc.nextFloat();
            soma += notas[i];
        }
        media = soma / notas.length;

        for (int i = 0; i < 5; i++){
            if (notas[i] >= media){
                cont++;
            }
        }
        System.out.println("media: " + media);
        System.out.println("quantos alunos: " + cont);
    }
}