package cliente;

public class Cliente {
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private double saldo;

    public Cliente(String nome, int idade, String email, String telefone, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    public void cadastrar() {}
    public void adicionarSaldo(double valor) {}
    public void escolherServico(String servico) {}
    public void escolherAcompanhante(String acompanhante) {}
    public void realizarPagamento(double valor) {}
}