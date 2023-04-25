import entities.PessoaSaudavel;
import entities.Cadeirante;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaSaudavel pessoaNormal = new PessoaSaudavel("João", 20, "123456789");

        pessoaNormal.andar();

        Cadeirante cadeirante = new Cadeirante("Maria", 30, "987654321");

        cadeirante.andar();
    }
}
