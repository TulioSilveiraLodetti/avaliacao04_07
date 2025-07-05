import java.util.Scanner;

public class Avaliacao01 {

    static final String USUARIO = "admin";
    static final int SENHA = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua senha:");
        int senha = scanner.nextInt();

        if ((USUARIO.equals(nome)) && (SENHA == senha)) {
            System.out.println("Login bem-sucedido.");

        }else{
            System.out.println("login inválido. Conta bloqueada.");

        }
    }
}
