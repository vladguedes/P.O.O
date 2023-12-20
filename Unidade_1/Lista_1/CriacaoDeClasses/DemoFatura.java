package Lista_1.CriacaoDeClasses;
import java.util.Scanner;

public class DemoFatura {
    public static void main(String[] args) {
        int quantidadeDeProdutos;
        String identificacao;
        String descricao;
        int quantidadeComprada;
        float precoUnitario;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de itens que deseja comprar: ");
        quantidadeDeProdutos = input.nextInt();

        Fatura[] faturas = new Fatura[quantidadeDeProdutos];

        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println("Digite o número de identificação: ");
            identificacao = input.next();
            
        }
        input.close();
    }
}