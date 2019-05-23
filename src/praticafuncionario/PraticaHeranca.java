package praticafuncionario;

public class PraticaHeranca {
    public static void main(String[] args) {
        //Código do Gerente
        Gerente g = new Gerente ();
        g.setNome ("Gerente");
        g.setSalario (2000);
        g.setLogin ("Adm");
        g.setSenha (123);
        System.out.println (g.imprimirDados ());
        //Código da Telefonista
        Telefonista t = new Telefonista ();
        t.setNome ("Telefonista");
        t.setSalario (1000);
        t.setCodigo (10);
        System.out.println (t.imprimirDados ());
        //Código da Secretaria
        Secretaria s = new Secretaria ();
        s.setNome ("Secretaria");
        s.setSalario (1200);
        s.setRamal (20);
        System.out.println (s.imprimirDados ());
    }
}