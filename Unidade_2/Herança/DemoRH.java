package Unidade_2.Herança;

public class DemoRH {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa("Joao", "098154");
        Funcionario f = new Funcionario("Pedro", "098123", 1000);
        ChefeDeDepartamento c = new ChefeDeDepartamento("Carlos", "098634", 3000, "Financeiro");

        //System.out.println(p);
        System.out.println(f);
        System.out.println(c);
    }
}
