package cliente.pagamento;

import cliente.Cliente;

public class Pagamento {
    private Cliente cliente;
    private double valor;
    private String formaDePagamento;

    public Pagamento(Cliente cliente, double valor, String formaDePagamento) {
        this.cliente = cliente;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    public Cliente getCliente() { return cliente; }
    public double getValor() { return valor; }
    public String getFormaDePagamento() { return formaDePagamento; }

    public void processarPagamento() {}
    public boolean validarSaldo() { return false; }
}
