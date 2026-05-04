import java.util.Scanner;

public class TesteABB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ABB<Integer> abb1 = new ABB<Integer>();
        // ... (inserts de Integer se desejar manter)

        System.out.println("\n--- Sistema MackBemVindo ---\n");
        ABB<Funcionario> abb2 = new ABB<Funcionario>();
        
        int opc;
        do {
            System.out.println("\nMenu de opcoes:");
            System.out.println("1. Cadastrar funcionario");
            System.out.println("2. Mostrar dados de todos os funcionários cadastrados");
            System.out.println("3. Mostrar gastos com salários dos funcionários");
            System.out.println("4. Mostrar total de funcionários de determinado sexo");
            System.out.println("5. Mostrar quantidade de funcionários de certa categoria");
            System.out.println("6. Mostrar dados de funcionários a partir de certa idade");
            System.out.println("7. Simular cadastro de funcionários");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opcao: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Funcionario func = cadastrar();
                    abb2.inserir(func);
                    break;
                case 2:
                    abb2.emOrdem2();
                    break;
                case 3:
                    double total = abb2.totalSalarios(abb2.getRaiz());
                    System.out.println("Total gasto com salários: " + total);
                    break;
                case 4:
                    System.out.print("Informe o sexo (M/F): ");
                    char sexo = sc.next().charAt(0);

                    int totalSexo = abb2.contarPorSexo(abb2.getRaiz(), sexo);
                    System.out.println("Total de funcionários do sexo " + sexo + ": " + totalSexo);
                    break;
                case 5:
                    System.out.print("Informe a categoria (P/O/H): ");
                    char categoria = sc.next().charAt(0);

                    int totalCat = abb2.contarPorCategoria(abb2.getRaiz(), categoria);
                    System.out.println("Total da categoria " + categoria + ": " + totalCat);
                    break;
                case 6:
                    System.out.print("Informe a idade mínima: ");
                    int idade = sc.nextInt();

                    System.out.println("\nFuncionários com idade >= " + idade + ":");
                    abb2.mostrarPorIdade(abb2.getRaiz(), idade);
                    break;
                case 7:
                    abb2.setRaiz(null);
                    simularCadastro(abb2);
                    System.out.println("\nFuncionários cadastrados com sucesso.");
                    break;
                case 8:
                    System.out.print("Deseja realmente sair? (S/N): ");
                    char resp = sc.next().charAt(0);

                    if (resp == 'S' || resp == 's') {
                        System.out.println("Encerrando sistema...");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opc != 8);
    }

    public static Funcionario cadastrar() {
        Scanner a = new Scanner(System.in);
        System.out.println("\n--- CADASTRO DE FUNCIONÁRIO ---");

        System.out.print("ID (Inteiro único): ");
        int id = a.nextInt();

        System.out.print("Categoria (P-Presencial, O-Home Office, H-Híbrido): ");
        char categoria = a.next().toUpperCase().charAt(0);
        a.nextLine();

        System.out.print("Nome: ");
        String nome = a.nextLine();

        System.out.print("Cargo: ");
        String cargo = a.nextLine();

        System.out.print("Sexo (F/M): ");
        char sexo = a.next().toUpperCase().charAt(0);

        System.out.print("Idade: ");
        int idade = a.nextInt();

        System.out.print("Salário: ");
        double salario = a.nextDouble();

        return new Funcionario(id, categoria, nome, cargo, sexo, idade, salario);
    }

    public static void simularCadastro(ABB<Funcionario> arvore) {
        // inserção de 20 funcionários 
        arvore.inserir(new Funcionario(1, 'H', "Thiago", "DBA", 'M', 45, 8500));
        arvore.inserir(new Funcionario(2, 'P', "Camila", "UX Designer", 'F', 29, 4500));
        arvore.inserir(new Funcionario(3, 'O', "Rafael", "QA Engineer", 'M', 31, 5000));
        arvore.inserir(new Funcionario(4, 'H', "Beatriz", "Scrum Master", 'F', 38, 7000));
        arvore.inserir(new Funcionario(5, 'P', "Leandro", "DevOps", 'M', 34, 7500));
        arvore.inserir(new Funcionario(6, 'O', "Juliana", "Tech Lead", 'F', 40, 9500));
        arvore.inserir(new Funcionario(7, 'H', "Marcos", "SysAdmin", 'M', 33, 4800));
        arvore.inserir(new Funcionario(8, 'P', "Letícia", "Engenheira de Dados", 'F', 27, 6200));
        arvore.inserir(new Funcionario(9, 'O', "Rodrigo", "Analista de Segurança", 'M', 36, 8000));
        arvore.inserir(new Funcionario(10, 'H', "Fernanda", "Product Owner", 'F', 35, 7800));
        arvore.inserir(new Funcionario(11, 'P', "Diego", "Desenvolvedor Mobile", 'M', 26, 4200));
        arvore.inserir(new Funcionario(12, 'O', "Amanda", "Cientista de Dados", 'F', 30, 8100));
        arvore.inserir(new Funcionario(13, 'H', "Marcelo", "Especialista Cloud", 'M', 42, 9000));
        arvore.inserir(new Funcionario(14, 'P', "Patrícia", "Analista de Negócios", 'F', 39, 6500));
        arvore.inserir(new Funcionario(15, 'O', "Gustavo", "Machine Learning", 'M', 32, 8800));
        arvore.inserir(new Funcionario(16, 'H', "Natália", "UI Designer", 'F', 25, 3800));
        arvore.inserir(new Funcionario(17, 'P', "Vinícius", "Suporte N3", 'M', 37, 5500));
        arvore.inserir(new Funcionario(18, 'O', "Aline", "SRE", 'F', 31, 7200));
        arvore.inserir(new Funcionario(19, 'H', "Ricardo", "Arquiteto", 'M', 44, 10500));
        arvore.inserir(new Funcionario(20, 'P', "Vanessa", "Qualidade", 'F', 28, 4100));
    }
}