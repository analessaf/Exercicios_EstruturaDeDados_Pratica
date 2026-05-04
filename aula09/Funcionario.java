public class Funcionario implements Comparable<Funcionario> {
    private int id;
    private char categoria;
    private String nome;
    private String cargo;
    private char sexo;
    private int idade;
    private double salario;

    public Funcionario(int id, char categoria, String nome, String cargo, char sexo, int idade, double salario) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.cargo = cargo;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }

     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public char getCategoria() {
        return categoria;
    }
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario outro) {
        // Compara por ID para organizar a Árvore Binária
        return Integer.compare(this.id, outro.id);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Categoria: %c | Nome: %s | Cargo: %s | Sexo: %c | Idade: %d | Salário: %.2f", id, categoria, nome, cargo, sexo, idade, salario);
    }
}