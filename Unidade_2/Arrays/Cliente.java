package Unidade_2.Arrays;

public class Cliente {
    private int id;
    private int idade;
    private String nome;
    private long telefone;

    public Cliente(int id, int idade, String nome, long telefone) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return ("id=" + id + ", idade=" + idade + ", nome=" + nome + ", telefone=" + telefone + "\n");
    }

    
}
