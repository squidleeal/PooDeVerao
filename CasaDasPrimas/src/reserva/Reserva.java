package reserva;

import java.io.FileWriter;
import java.io.IOException;

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

    public void confirmarReserva() {
        salvarEmArquivo();
        System.out.println("Reserva confirmada!");
    }
    public void cancelarReserva() {
        System.out.println("Reserva cancelada.");
    }
    public double calcularValor() {
        return servico.getPreco() * duracao;
    }

    private void salvarEmArquivo() {
        try (FileWriter writer = new FileWriter("reservas.txt", true)) {
            writer.write("Cliente: " + cliente.getNome() + "\n");
            writer.write("Acompanhante: " + acompanhante.getNome() + "\n");
            writer.write("Serviço: " + servico.getDescricao() + "\n");
            writer.write("Duração: " + duracao + " horas\n");
            writer.write("Valor Total: R$ " + valorTotal + "\n");
            writer.write("-----------------------------\n");
            System.out.println("Reserva salva com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar a reserva: " + e.getMessage());
        }
    }
}
