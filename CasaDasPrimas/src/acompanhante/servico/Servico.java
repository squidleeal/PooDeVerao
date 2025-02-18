package acompanhante.servico;

public class Servico {
    private String tipo;
    private double preco;

    public Servico(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
