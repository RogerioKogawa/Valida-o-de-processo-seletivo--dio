import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo número: ");
        int segundoNumero = Integer.parseInt(input.nextLine());
    }
}