package cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private static List<Cliente> clientes = new ArrayList<>();

    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public Cliente(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }

    public void cadastrar(Scanner scanner) {
        
        while (true) {
            System.out.print("Digite seu nome: ");
            this.nome = scanner.nextLine().trim();

            if (this.nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ ]+$")) {
                break;
            } else {
                System.out.println("Nome inválido! Digite apenas letras.");
            }
        }

        
        while (true) {
            System.out.print("Digite sua idade: ");
            if (scanner.hasNextInt()) {
                this.idade = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                if (this.idade >= 18) {
                    break;
                } else {
                    System.out.println("Idade inválida! Você deve ter mais de 18 anos.");
                }
            } else {
                System.out.println("Por favor, digite um número válido para idade.");
                scanner.next(); 
            }
        }

    
        System.out.print("Digite seu telefone: ");
        this.telefone = scanner.nextLine().trim();


        while (true) {
            System.out.print("Digite seu e-mail: ");
            this.email = scanner.nextLine().trim();

            if (this.email.matches("^[\\w.-]+@email\\.com$")) {
                break;
            } else {
                System.out.println("E-mail inválido! O e-mail deve terminar com '@email.com'.");
            }
        }

        // Criando e salvando o cliente
        Cliente novoCliente = new Cliente(nome, idade, email, telefone);
        clientes.add(novoCliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + ", Idade: " + c.getIdade() + ", Email: " + c.getEmail() + ", Telefone: " + c.getTelefone());
        }
    }
}
