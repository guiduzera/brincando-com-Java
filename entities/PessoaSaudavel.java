package entities;

public class PessoaSaudavel extends Pessoa {
    private boolean _usaCadeiraDeRodas;
    public PessoaSaudavel(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this._usaCadeiraDeRodas = false;
    }

    public void andar() {
        if (this._usaCadeiraDeRodas) {
            System.out.println("Andando com a cadeira de rodas...");
        } else {
            System.out.println("Andando...");
        }
    }
}
