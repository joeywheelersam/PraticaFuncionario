package praticafuncionario;

public class Gerente extends Funcionario {
    String login;
    String dados;
    double senha;
    public Gerente () {
        login=null;
        dados=null;
        senha=0;
    }
    public String getLogin () {
        return login;
    }
    public double getSenha () {
        return senha;
    }
    public void setLogin (String login) {
        this.login = login;
    }
    public double setSenha (double senha) {
        this.senha = senha;
        return 0;
    }
    public String imprimirDados () {
        String dados = "Nome: " + nome + "\nSalario: " + salario + "\nLogin: " + login + "\nSenha: " + senha + "\n";
        return dados;
    }
}