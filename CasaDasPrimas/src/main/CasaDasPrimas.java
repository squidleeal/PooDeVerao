package main;

import acompanhante.Acompanhante;
import acompanhante.servico.Servico;
import cliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import reserva.Reserva;

public class CasaDasPrimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = null;
        boolean cadastrado = false;

        while (true) {
            System.out.println("\nBem-vindo à Casa das Primas, beach!");
            System.out.println("Escolha uma opção:");
            if (!cadastrado) {
                System.out.println("1. Cadastrar-se");
            }
            System.out.println("2. Listar Serviços");
            System.out.println("3. Listar Acompanhantes");
            if (cadastrado) {
                System.out.println("4. Realizar reserva");
            }
            System.out.println("5. Sair");
            
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    if (!cadastrado) {
                        cliente = new Cliente("", 0, "", "");
                        cliente.cadastrar();
                        cadastrado = true;
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }
                
                case 2 -> Servico.listarServicos();
                
                case 3 -> {
                    System.out.println("Acompanhantes disponíveis: \n");
                    Acompanhante.listarAcompanhantes();
                }
                
                case 4 -> {
                    if (cliente.getNome().isEmpty()) {
                        System.out.println("Deve-se cadastrar primeiro!");
                        break;
                    }

                    System.out.println("Digite o nome exato da acompanhante desejada:");
                    String nomeAcompanhante = scanner.nextLine();
                    Acompanhante acompanhanteEscolhida = Acompanhante.buscarAcompanhante(nomeAcompanhante);

                    if (acompanhanteEscolhida == null) {
                        System.out.println("Acompanhante não encontrada!");
                        break;
                    }
                    List<Servico> servicosEscolhidos = new ArrayList<>();
                    while (true) {
                        System.out.println("Digite o nome exato do serviço desejado:");
                        String nomeServico = scanner.nextLine();
                        Servico servicoEscolhido = Servico.buscarServico(nomeServico);

                        if (servicoEscolhido == null) {
                            System.out.println("Serviço não encontrado!");
                        } else {
                            servicosEscolhidos.add(servicoEscolhido);
                            System.out.println("Serviço adicionado: " + servicoEscolhido.getNome());
                        }

                        System.out.println("Deseja adicionar outro serviço? (S/N)");
                        String resposta = scanner.nextLine().trim().toLowerCase();
                        if (!resposta.equals("s")) break;
                    }
                    if (servicosEscolhidos.isEmpty()) {
                        System.out.println("Reserva cancelada. Nenhum serviço foi selecionado.");
                        break;
                    }
                    
                    Reserva reserva = new Reserva(cliente, acompanhanteEscolhida, servicosEscolhidos, 3);
                    reserva.confirmarReserva();
                }
                    
                case 5 -> {
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                }
                
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


        