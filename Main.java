import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Caue Caina";
        double saldo = 2500.00;
        String tipoDeConta = "Corrente";
        int operacao = 0;
        double deposito = 0;
        double pix = 0;
        String pixChave;
        boolean sair = false;

        Scanner valor1 = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);
        Scanner chave = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:               " + nome);
        System.out.println("Tipo de conta:      " + tipoDeConta);
        System.out.println("Saldo Inicial:      R$" + saldo);
        System.out.println("*****************************************");
        System.out.println(" ");
        System.out.println(" ");

        String menu = """
                1 - Consultar saldo
                2 - Depósito
                3 - Transferencia Pix
                4 - Sair
                """;


            while (operacao != 4) {
                System.out.println("Selecione a operação que deseja:");
                System.out.println("\n" + menu);
                operacao = op.nextInt();

                if (operacao == 1) {
                System.out.println("Você tem R$ " + saldo);

                } else if (operacao == 2) {

                    System.out.println("Qual o valor do depósito? ");
                    deposito = valor1.nextDouble();
                    System.out.println("Gerando boleto de deposito no valor de: R$ " + deposito);
                    System.out.println(" ");
                    System.out.println("BOLETO IMAGINARIO");
                    System.out.println(" ");
                    saldo = saldo + deposito;
                    System.out.println("Valor de saldo atulizado para: " + saldo);

                }else if (operacao == 3) {
                        System.out.println("Qual o valor que deseja transferir:");
                        pix = valor2.nextDouble();
                        if (pix > saldo) {
                            System.out.println("Você não tem saldo disponivel para essa operação");
                        }else {
                            System.out.println("\nValor da transferência: R$ " + pix);
                            System.out.println("\nInsira a chave pix destinatária: ");
                            pixChave = chave.nextLine();
                            System.out.println("\nConfirme a chave: " + pixChave);
                            saldo = saldo - pix;
                            System.out.println("\n\nSeu saldo restante é: " + saldo);
                        }
                } else if (operacao != 4) {
                    System.out.println("opção invalida");
                }


            }
    }
}
