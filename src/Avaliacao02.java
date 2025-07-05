import java.util.Scanner;

public class Avaliacao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor deseja pegar emprestado?");
        double valorEmprestado = scanner.nextDouble();

        System.out.println("Em quantas parcelas deseja pagar (de 1 a 24)");
        double parcelas = scanner.nextInt();

        System.out.println("Qual o salário mensal que ele recebe?");
        double salario = scanner.nextDouble();

        valorEmprestado = valorEmprestado / parcelas;

        if ((parcelas < 1) || (parcelas > 24)) {
            System.out.println("Não pode ser aprovado.");
        }else
            System.out.println("Empréstimo aprovado. Valor de cada parcela: R$ " + valorEmprestado );



        }

    }
