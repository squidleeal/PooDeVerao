package acompanhante;

import java.util.List;

public class Acompanhante { //Encpsulamento
    private String nome;
    private String genero;
    private String telefone;
    private String orientacao;

    public Acompanhante(String nome, String genero, String telefone, String orientacao) {
        this.nome = nome;
        this.genero = genero;
        this.telefone = telefone;
        this.orientacao = orientacao;
    }

    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public String getTelefone() { return telefone; } 
    public String getOrientacao() { return orientacao; }
    @Override
    public String toString() {
        return "Acompanhante: " +
                " nome: " + nome + '\'' +
                ", genero: " + genero + '\'' +
                ", telefone: " + telefone + '\'' +
                ", Orientação Sexual: " + orientacao + '\'';
    }
    public static List<Acompanhante> getAcompanhantes() {/Abstração
        return List.of(
            new Acompanhante("Maria Silva", "Feminino", "(11) 98765-4321", "Heterossexual"),
            new Acompanhante("João Pereira", "Masculino", "(21) 99874-1234", "Homossexual"),
            new Acompanhante("Carla Mendes", "Feminino", "(31) 97654-6789", "Bissexual"),
            new Acompanhante("Emanuel Badaro", "Masculino", "(41) 91234-5678", "Heterossexual"),
            new Acompanhante("Ana Oliveira", "Feminino", "(51) 93456-7890", "Pansexual")
        );
    }
    public static void listarAcompanhantes(){
        List<Acompanhante> acompanhantes = getAcompanhantes();
        acompanhantes.forEach(System.out::println);
    }
    

    public static Acompanhante buscarAcompanhante(String nome) {
        List<Acompanhante> acompanhantes = getAcompanhantes();
        for (Acompanhante a : acompanhantes) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }
}
