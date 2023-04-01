public class Fabricante extends Chassi {
    private String nome;

    public Fabricante(String nome, String numeroChassi) {
        super(numeroChassi);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
