package entities;

public class Cadeirante extends Pessoa {
    private boolean _usaCadeiraDeRodas;

    public Cadeirante(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this._usaCadeiraDeRodas = true;
    }

    public void andar() {
        if (this._usaCadeiraDeRodas) {
            System.out.println("Andando com a cadeira de rodas...");
        } else {
            System.out.println("Andando...");
        }
    }
}
