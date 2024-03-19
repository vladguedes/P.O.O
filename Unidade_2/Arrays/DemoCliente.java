package Unidade_2.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        int index = 0;
        int saida = 1;
        Scanner input = new Scanner(System.in);
        
        while (saida != 0) {
            listaDeClientes.add(new Cliente());
            System.out.println("Cliente " + index);
            System.out.print("Digite seu número de identificação: ");
            listaDeClientes.get(index).setId(input.nextInt());

            if (listaDeClientes.get(index).getId() < 0) {
                break;
            }

            System.out.print("Digite sua idade: ");
            listaDeClientes.get(index).setIdade(input.nextInt());
            System.out.print("Digite seu nome: ");
            input.nextLine();
            listaDeClientes.get(index).setNome(input.nextLine());
            System.out.print("Digite seu número de telefone: ");
            listaDeClientes.get(index).setTelefone(input.nextLong());

            index++;

        }

        System.out.println("Listando dados dos clientes.");

        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }

        input.close();
    }
}
