package praticafuncionario;

public class Secretaria extends Funcionario {
    int ramal;
    String dados;
    public Secretaria () {
        ramal=0;
        dados=null;
    }
    public int getRamal () {
        return ramal;
    }
    public int setRamal (int ramal) {
        this.ramal = ramal;
        return 0;
    }
    public String imprimirDados () {
        String dados = "Nome: " + nome + "\nSalario: " + salario + "\nRamal: " + ramal + "\n";
        return dados;
    }
}