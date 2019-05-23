package praticafuncionario;

public class Telefonista extends Funcionario {
    int codigo;
    String dados;
    public Telefonista () {
        codigo=0;
        dados=null;
    }
    public int getCodigo () {
        return codigo;
    }
    public int setCodigo (int codigo) {
        this.codigo = codigo;
        return 0;
    }
    public String imprimirDados () {
        String dados = "Nome: " + nome + "\nSalario: " + salario + "\nCódigo: " + codigo + "\n";
        return dados;
    }
}