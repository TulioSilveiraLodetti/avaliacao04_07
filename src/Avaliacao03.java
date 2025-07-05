import java.util.Scanner;

public class Avaliacao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.print("Você é estudante? (S para sim ou N para não): ");
        String resposta = scanner.next();


        if ((idade <= 5) || (idade >= 66)) {
            System.out.println("Valor a pagar: R$ 0");

        } else if ((idade <= 25) && (idade > 5) && resposta.equals("S")) {
            System.out.println("Valor a pagar: R$ 2");
        }else {
            System.out.println("Valor a pagar: R$ 4");
        }

    }
}


