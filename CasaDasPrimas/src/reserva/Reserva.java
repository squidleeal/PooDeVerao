package reserva;

import acompanhante.Acompanhante;
import acompanhante.servico.Servico;
import cliente.Cliente;

public class Reserva {
    private Cliente cliente;
    private Acompanhante acompanhante;
    private Servico servico;
    private int duracao;
    private double valorTotal;

    public Reserva(Cliente cliente, Acompanhante acompanhante, Servico servico, int duracao) {
        this.cliente = cliente;
        this.acompanhante = acompanhante;
        this.servico = servico;
        this.duracao = duracao;
        this.valorTotal = calcularValor();
    }

    public Cliente getCliente() { return cliente; }
    public Acompanhante getAcompanhante() { return acompanhante; }
    public Servico getServico() { return servico; }
    public int getDuracao() { return duracao; }
    public double getValorTotal() { return valorTotal; }

    public void confirmarReserva() {}
    public void cancelarReserva() {}
    public double calcularValor() { return 0.0; }
}
