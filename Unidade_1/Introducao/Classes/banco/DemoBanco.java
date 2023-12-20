package banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Joao");
        System.out.println(conta1);    
        ContaBancaria conta2 = new ContaBancaria("Vlad", 5000, true);
        System.out.println(conta2);
        ContaBancaria conta3 = new ContaBancaria("Moises", 100, false);
        System.out.println(conta3);
    }
}
