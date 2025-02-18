package main;
import cliente.Cliente;

public class CasaDasPrimas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("", 0, "", "");
        cliente.cadastrar();
        Cliente.mostrarClientes();
        System.out.println("Bem vindo a Casa das Primas, beach!");
    }
}



        