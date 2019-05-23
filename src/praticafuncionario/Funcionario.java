package praticafuncionario;

public class Funcionario {
    String nome;
    double salario;
    public Funcionario () {
        nome = null;
        salario = 0;
    }
    public String getNome () {
        return nome;
    }
    public double getSalario () {
        return salario;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public double setSalario (double salario) {
        this.salario = salario;
        return 0;
    }
}