import java.util.ArrayList;

public class TarefaDAO {
    private ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

    public boolean inserir(Tarefa t) {
        if (buscar(t.getID()) == null) {
            int index = buscarPosicaoPrioridade(t);
            if (index >= 0) {
                listaDeTarefas.add(index, t);
            } else {
                listaDeTarefas.add(t);
            }
            return true;
        }
        return false;
    }

    public int buscarPosicaoPrioridade(Tarefa t) {
        int pesoNova = atribuirPeso(t.getPrioridade());

        for (int i = 0; i < listaDeTarefas.size(); i++) {
            int pesoAtual = atribuirPeso(listaDeTarefas.get(i).getPrioridade());
            if (pesoAtual > pesoNova) {
                return i;
            }
        }
        return -1;
    }

    private int atribuirPeso(String prioridade) {
        if (prioridade.equalsIgnoreCase("Alta")) return 1;
        if (prioridade.equalsIgnoreCase("Média")) return 2;
        return 3;
    }

    public Tarefa buscar(int ID) {
        for (Tarefa t : listaDeTarefas) {
            if (t.getID() == ID) {
                return t;
            }
        }
        return null;
    }

    public boolean atualizar(int id, String novaDescricao, String novoStatus) {
        Tarefa t = buscar(id);
        if (t != null) {
            t.setDescricao(novaDescricao);
            t.setStatus(novoStatus);
            return true;
        }
        return false;
    }

    public boolean remover(int id) {
        Tarefa t = buscar(id);
        if (t != null) {
            listaDeTarefas.remove(t);
            return true;
        }
        return false;
    }

    public int contarConcluidas() {
        int cont = 0;
        for (Tarefa t : listaDeTarefas) {
            if (t.getStatus().equalsIgnoreCase("Concluída")) {
                cont++;
            }
        }
        return cont;
    }

    public String listarPendentes() {
        String saidaa = "--- Tarefas Pendentes ---\n";
        for (Tarefa t : listaDeTarefas) {
            if (t.getStatus().equalsIgnoreCase("Pendente")) {
                saidaa += t.getID() + "\n";
            }
        }
        return saidaa;
    }

    @Override
    public String toString() {
        String saida = "--- Todas as Tarefas ---\n";
        for (Tarefa t : listaDeTarefas) {
            saida += t.getID() + "\n";
        }
        return saida;
    }
}