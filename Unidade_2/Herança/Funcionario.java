package Unidade_2.Herança;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String identidade, double salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        String res = super.toString();
        res += "Salario: " + salario + "\n";
        return (res);
    }
}
