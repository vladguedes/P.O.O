import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        System.out.println("Digite em qual dos sequinte setores deseja comprar e informe o preço do produto.");
        System.out.println("Setor de cama, mesa e banho: 111\nSetor se Eletros:");
        Scanner input = new Scanner(System.in);
        int setor;
        double valorDoProduto = 0;

        setor = input.nextInt();
        System.out.print("Setor: ");
        
        switch (setor) {
            case 111:
            System.out.print("Valor do produto: ");
            valorDoProduto = input.nextDouble();

            if (valorDoProduto >= 100) {
                valorDoProduto = valorDoProduto - (valorDoProduto * 0.4);
            }
            else if (valorDoProduto >= 50 && valorDoProduto < 100) {
                valorDoProduto = valorDoProduto - (valorDoProduto * 0.2);
            }
            else {
                valorDoProduto = valorDoProduto - (valorDoProduto * 0.1);
            }
                
                break;
            
            case 222:
            System.out.print("Valor do produto: ");
            valorDoProduto = input.nextDouble();

            if (valorDoProduto >= 500) {
                valorDoProduto = valorDoProduto - (valorDoProduto * 0.1);
            }
        
            default:
            System.out.println("Setor Inválido");
                System.exit(0);
        }
        System.out.printf("Seu valor com desconto foi %g", valorDoProduto);

        input.close();
    }
}
