public class Main {
    public static void main(String[] args) {
        TarefaDAO base = new TarefaDAO();

        System.out.println("--- Cadastrando Tarefas ---");
        
        Tarefa t1 = new Tarefa(1, "Estudar Java", "Alta","Pendente");
        Tarefa t2 = new Tarefa(2, "Fazer exercicios", "Media", "Pendente");
        Tarefa t3 = new Tarefa(3, "Revisar aula", "Baixa", "Pendente");
        Tarefa t4 = new Tarefa(4, "Academia", "Media", "Pendente");
        Tarefa t5 = new Tarefa(5, "Comprar cafe", "Alta", "Pendente");

        if (base.inserir(t1)) System.out.println("Tarefa 1 cadastrada");
        if (base.inserir(t2)) System.out.println("Tarefa 2 cadastrada");
        if (base.inserir(t3)) System.out.println("Tarefa 3 cadastrada");
        if (base.inserir(t4)) System.out.println("Tarefa 4 cadastrada");
        if (base.inserir(t5)) System.out.println("Tarefa 5 cadastrada");

        System.out.println("\n--- 3. Listagem Inicial ---");
        System.out.println(base);

        System.out.println("--- 4. Buscando Tarefa ID 5 ---");
        Tarefa buscada = base.buscar(5);
        if (buscada != null) {
            System.out.println("Encontrada: ID - " + buscada.getID() + ", TAREFA - " + buscada.getDescricao());
        } else {
            System.err.println("Tarefa nao encontrada!");
        }

        System.out.println("\n--- 5 e 6. Atualizando ID 1 e Concluindo ID 3 ---");
        base.atualizar(1, "Estudar Java Avancado", "Pendente");
        base.atualizar(3, "Revisar aula", "Concluída");

        System.out.println("--- 7. Removendo Tarefa ID 4 ---");
        if (base.remover(4)) {
            System.out.println("Removido com sucesso.");
        } else {
            System.err.println("Erro ao remover.");
        }

        System.out.println("\n--- 8. Lista Atualizada ---");
        System.out.println(base);

        System.out.println("--- 9. Total de Concluidas ---");
        System.out.println("Total: " + base.contarConcluidas());

        System.out.println("\n" + base.listarPendentes());

        System.out.println("--- 11. Lista Ordenada (Alta > Media > Baixa) ---");
        System.out.println(base);
    }
}