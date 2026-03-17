import java.util.Scanner;

public class Proposta1 {
    public static void main(String[] args){
        String simbolos[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor naa base 10: ");
        int num = sc.nextInt();
        System.out.println("Digite a base para converter ( 2 | 8 | 10): ");
        int sist_num = sc.nextInt();

        PilhaInt base_ = converterDecQulaquer(num, sist_num);
        String resp = "";
        while (base_.isEmpty() != true){
            int topo = base_.top();
            resp += simbolos[topo];
        }
        System.out.println("Dec = " + num + ", "Base ("+ sist_num +") = " + resp);

    }

    public static PilhaInt converterDecQulaquer(int num, int base){
        int tam = (int)Math.floor(Math.log(num)/Math.log(base)+ 1);
        PilhaInt aux = new PilhaInt(tam);
        while (num != 0){
            aux.push(num % base);
            num = num / base;
        }
        return aux;
    }
}
