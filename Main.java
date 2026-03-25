import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int minuto;
        int duracao = 30;
        Fila clientes = new Fila(duracao * 2);
        int qtd_c = 0;
        int t_total = 0;
        float t_medio = 0;
        int t_maior = 0;
        int r = 0;
        int contMin = 0;

        Random rand = new Random();
        
        for(minuto = 0; minuto < duracao; minuto++){
            if (!clientes.isEmpty()){
                int chegada = clientes.dequeue();
                int tempoEspera = minuto - chegada;
        
                t_total += tempoEspera;
                qtd_c++;
        
                if (tempoEspera > t_maior)
                    t_maior = tempoEspera;
            }
        
            int k = rand.nextInt(3);
            if (k == 1){
                clientes.enqueue(minuto);
            } else if (k == 2){
                clientes.enqueue(minuto);
                clientes.enqueue(minuto);
            }
        }
        
        if (qtd_c > 0)
            t_medio = t_total / qtd_c;

        System.out.println("Quantidade de clientes atendidos: " + qtd_c);
        System.out.println("Maior tempo de espera: " + t_maior);
        System.out.println("Tempo médio de atendimento: " + t_medio); 
    }
}
