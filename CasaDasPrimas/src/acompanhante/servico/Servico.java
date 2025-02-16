package acompanhante.servico;

public class Servico {
    private String nome;
    private String descricao;
    private double precoBase;

    public Servico(String nome, String descricao, double precoBase) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPrecoBase() { return precoBase; }

    public void listarServicosDisponiveis() {}
    public double calcularPrecoTotal() { return 0.0; }
}

