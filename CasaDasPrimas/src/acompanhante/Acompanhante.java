package acompanhante;

public class Acompanhante {
    private String nome;
    private int idade;
    private String genero;
    private String tipo;
    private double precoPorHora;

    public Acompanhante(String nome, int idade, String genero, String tipo, double precoPorHora) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.tipo = tipo;
        this.precoPorHora = precoPorHora;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getGenero() { return genero; }
    public String getTipo() { return tipo; }
    public double getPrecoPorHora() { return precoPorHora; }

    public boolean disponivel() { return false; }
    public void atenderCliente() {}
    public double calcularPrecoTotal(int horas) { return 0.0; }
}