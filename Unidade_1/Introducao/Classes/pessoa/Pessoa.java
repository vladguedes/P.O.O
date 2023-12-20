package pessoa;

public class Pessoa {
    private String nome;
    private double altura;

    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return ("Nome: " + this.nome);
    }

    public void setNome(String novoNome) {
        if (!novoNome.equals(" ")) {
            nome = novoNome;
        } else {
            System.out.println("Novo nome invalido!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        if (novaAltura > 0) {
            altura = novaAltura;
        } else {
            System.out.println("Nova altura invalida!");
        }
    }

    public String toString() {
        String res = "";
        res += "Nome: " + nome + "\n";
        res += "Altura: " + altura + "\n";
        
        return (res);
    }
}
