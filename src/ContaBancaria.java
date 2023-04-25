import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double saldoConta = 2500.00;

        //inicializar dados do cliente
        System.out.println("*********************************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println();
        System.out.println("Nome:             Anderson Passione");
        System.out.println("Tipo de conta:    Corrente");
        System.out.println("Saldo inicial:    R$" + saldoConta);
        System.out.println("*********************************************");
        System.out.println();
        //menu opções
        System.out.println("Operações");
        System.out.println();
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

    }
}
