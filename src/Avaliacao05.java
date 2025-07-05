import java.util.Scanner;

public class Avaliacao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero correspondente aos dias da semana");
        int mes = scanner.nextInt();

        switch (mes){

            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sábado");
                break;

            default:
                System.out.println("O numero do dias da semana que vc digitou está incorreto:");
        }
    }
}




