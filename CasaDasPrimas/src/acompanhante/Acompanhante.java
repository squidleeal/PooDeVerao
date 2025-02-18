package acompanhante;

public class Acompanhante {
    private String nome;
    private String genero;
    private String telefone;

    public Acompanhante(String nome, String genero, String telefone) {
        this.nome = nome;
        this.genero = genero;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Acompanhante{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}