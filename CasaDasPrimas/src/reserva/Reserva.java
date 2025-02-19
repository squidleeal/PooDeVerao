package reserva;

import acompanhante.Acompanhante;
import acompanhante.servico.Servico;
import cliente.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Acompanhante acompanhante;
    private List<Servico> servicos = new ArrayList<>();
    private int duracao;
    private double valorTotal;

    public Reserva(Cliente cliente, Acompanhante acompanhante, List<Servico> servicos, int duracao) {
        this.cliente = cliente;
        this.acompanhante = acompanhante;
        this.servicos = servicos;
        this.duracao = 3;
        this.valorTotal = calcularValor();
    }

    public Cliente getCliente() { return cliente; }
    public Acompanhante getAcompanhante() { return acompanhante; }
    public List<Servico> getServicos() {
        return servicos;
    }
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
        return servicos.stream().mapToDouble(Servico::getPreco).sum() * duracao;
    }
    

    private void salvarEmArquivo() {
        try (FileWriter writer = new FileWriter("reservas.txt", true)) {
            writer.write("Cliente: " + cliente.getNome() + "\n");
            writer.write("Acompanhante: " + acompanhante.getNome() + "\n");
            writer.write("Serviços: \n");
            for (Servico servico : servicos) {
                writer.write("- " + servico.getNome() + "\n");
            }
            writer.write("Duração: " + duracao + " horas\n");
            writer.write("Valor Total: R$ " + valorTotal + "\n");
            writer.write("-----------------------------\n");
            System.out.println("Reserva salva com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar a reserva: " + e.getMessage());
        }
    }
    

}
