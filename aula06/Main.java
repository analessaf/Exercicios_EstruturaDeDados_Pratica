import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int duracao = 480;
        Fila clientes = new Fila(duracao*2);
        int minuto;
        int qtd_c = 0;
        int total_t = 0;
        int maior_tempo = 0;
        int tempo_medio = 0;
        Random rand = new Random ();
        int r = 0;


        for (minuto = 0; minuto < duracao; minuto++ ){
            if (!clientes.isEmpty()){
                r = clientes.dequeue();
                qtd_c++;
                int temp = minuto - r;
                tempo_medio += temp;
                if (temp > maior_tempo){
                    maior_tempo = temp;
                }
            }
            int k = rand.nextInt(3);
            if (k == 1){
                clientes.enqueue(minuto);
            }else if (k == 2) {
                clientes.enqueue(minuto);
                clientes.enqueue(minuto);
            }
        }
        float t_media = (float) tempo_medio / qtd_c;
        System.out.println("Qtd de clientes atendidos: " + qtd_c);
        System.out.println("Maior tempo de espera: " + maior_tempo);
        System.out.println("Tempo medio de espera: " + t_media);


    }
}
