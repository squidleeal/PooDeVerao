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
    

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.matches(".*\\d.*")) {  // Verifica se o nome contém números
                System.out.println("Nome não pode conter números. Tente novamente.");
            } else {
                break;
            }
        }

        int idade;
        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
        
            if (idade < 18 ) {
                System.out.println("Não permitimos menores de 18 anos. Tente novamente.");
            } 
            else if (idade > 100 ){
                System.out.println("Idade inválida. Tente novamente.");    
            } 
            else {
                break; // Sai do loop se a idade for válida
            }
        }

        while (true) {
            System.out.print("Email: ");
            String email = scanner.nextLine();
            if (!email.endsWith("@gmail.com")) {
                System.out.println("Email deve terminar com '@gmail.com'. Tente novamente.");
            } else {
                break;
            }
        }
        

        while (true) {
            System.out.print("Telefone: (exemplo: (ddd) 9xxxx-xxxx): ");
            String telefone = scanner.nextLine();
            if (!telefone.matches("\\(\\d{2}\\) 9\\d{4}-\\d{4}")) {  // Verifica o formato (xx) xxxx-xxxx
                System.out.println("Telefone inválido. O formato correto é (ddd) 9xxxx-xxxx. Tente novamente.");
            } else {
                break;
            }
        }

        Cliente novoCliente = new Cliente(nome, idade, email, telefone);
        clientes.add(novoCliente);

        System.out.println("Cliente cadastrado com sucesso!");
        scanner.close();
        
    }
    public static void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + ", Idade: " + c.getIdade() + ", Email: " + c.getEmail() + ", Telefone: " + c.getTelefone());
        }
    }
}
    
    
