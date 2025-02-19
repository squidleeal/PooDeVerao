package acompanhante.servico;

import java.util.List;

public class Servico {
    private String nome;
    private String descricao;
    private double preco;

    public Servico(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
   
    @Override
    public String toString() {
        return "Servico: \n" +
                "tipo: '" + nome + '\'' +
                "\n Descrição: '" + descricao + '\'' +
                "\n Preço: R$" + preco;
    }
    public static List<Servico> getServicos() {
        return List.of(
            new Servico("Dança Sensual", 
                "Uma dança picante para ser apenas assistida! Vestimenta e local a critérios da(o) Acompanhante, defina os demais detalhes como música e coreografia pelo whatsapp da(o) Acompanhante. Divirta-se!", 
                75.00),  
            
            new Servico("Transa Simples", 
                "Transa simples sem fetiches. Apenas a experiência de uma relação sexual sem maiores complicações, voltada para o prazer mútuo.", 
                150.00),
            
            new Servico("Transa Completa", 
                "Transa simples com fetiches. Inclui a adição de práticas sexuais alternativas como bondage, roleplay, entre outros, conforme o gosto do cliente.", 
                250.00),
            
            new Servico("Blowjob", 
                "Prática oral onde o cliente recebe a estimulação genital oral da(o) Acompanhante.", 
                120.00),
            
            new Servico("Golden Shower", 
                "Prática onde o cliente ou a(o) Acompanhante urina sobre o outro, como parte de fetiche específico.", 
                180.00)
        );
    }

    public static void listarServicos() {
        List<Servico> servicos = getServicos();
        servicos.forEach(System.out::println);
    }

    public static Servico buscarServico(String nome) {
        List<Servico> servicos = getServicos();
        for (Servico s : servicos) {
            if (s.getNome().equalsIgnoreCase(nome)) {
                return s;
            }
        }
        return null;
    }
    
    
}

