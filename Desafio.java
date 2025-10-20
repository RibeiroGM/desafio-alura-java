import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Stephanie Santos";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        String mensagemInicial = """
                --------------------------------------
                Dados iniciais do cliente:
                
                Nome:                  %s
                Tipo conta:            %s
                Saldo Inicial          %.2f
                --------------------------------------
                """.formatted(nome, tipoConta, saldo);
        System.out.println(mensagemInicial);

        int opcaoDesejada = 0;

        String mensagemOperacoes = """
                Operações
                
                1- Consultar saldos
                2- Depositar valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        while (opcaoDesejada != 4) {
            System.out.println(mensagemOperacoes);
            opcaoDesejada = leitura.nextInt();

        switch(opcaoDesejada) {
            case 1:
                System.out.println("Seu saldo é de R$ " + saldo);
                System.out.println();
                break;

            case 2:
                System.out.println("Informe o valor de depósito:");
                double deposito = leitura.nextDouble();

                if (deposito <= 0) {
                    System.out.println("Valor inválido! Informe um valor positivo.\n");
                } else {
                saldo += deposito;
                System.out.println("Deposito realizado!");
                System.out.println("Saldo atualizado R$ " + saldo);
                }
                System.out.println();
                break;

            case 3:
                System.out.println("Informe o valor para tranferência:");
                double tranferencia = leitura.nextDouble();

                if (saldo >= tranferencia) {
                    saldo -= tranferencia;
                    System.out.println("Transferência realizada!");
                    System.out.println("Saldo atualizado R$" + saldo );
                } else {
                    System.out.println("Não há saldo suficiente para essa transfêrencia \n");
                }
                break;

            case 4:
                System.out.println("Encerrando atendimento...");
                break;

            default:
                System.out.println("opção inválida");
                break;

        }

        }


        }

    }

