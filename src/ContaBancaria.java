import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Anderson Passione";
        String tipoConta = "Corrente";
        double saldoConta = 2500.00;
        int numeroMenuOpcoes = 0;

        //inicializar dados do cliente
        System.out.println("*********************************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println();
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo de conta:    " + tipoConta);
        System.out.println("Saldo inicial:    R$" + saldoConta);
        System.out.println("*********************************************");
        System.out.println();

        while (numeroMenuOpcoes != 4) {

            //Menu opções
            System.out.println("Operações");
            System.out.println();
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();
            numeroMenuOpcoes = scanner.nextInt();


            //Adicionando interação com o Menu
            switch (numeroMenuOpcoes) {
                case 1:
                    System.out.println();
                    System.out.println("Saldo da conta: R$" + saldoConta);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Informe o valor a ser depositado");
                    double valorDepositado = scanner.nextDouble();
                    if (valorDepositado > 0) {
                        saldoConta += valorDepositado;
                        System.out.println("Saldo atual: R$" + saldoConta);
                        break;
                    } else {
                        System.out.println("Valor inválido");
                        break;
                    }

                case 3:

                case 4:
                    System.out.println();
                    System.out.println("Finalizando");
                    System.out.println();
                    break;
                default:
                    System.out.println("Número/caractere inválido, digite novamente");
            }
        }



    }
}
