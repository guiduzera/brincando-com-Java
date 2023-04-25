package entities;

public abstract class Pessoa implements interfaces.Pessoa {
    private String _nome;
    private int _idade;
    private String _cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this._nome = nome;
        this._idade = idade;
        this._cpf = cpf;
    }

    public String getNome() {
        return this._nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public int getIdade() {
        return this._idade;
    }

    public void setIdade(int idade) {
        this._idade = idade;
    }

    public String getCpf() {
        return this._cpf;
    }

    public void setCpf(String cpf) {
        this._cpf = cpf;
    }

    public void andar() {
        System.out.println("Andando...");
    }
}
