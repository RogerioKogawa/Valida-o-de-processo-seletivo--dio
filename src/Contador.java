import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContadorService service = new ContadorService();
        try{
            System.out.println("Digite o primeiro número: ");
            int primeiroNumero = Integer.parseInt(input.nextLine());

            System.out.println("Digite o segundo número: ");
            int segundoNumero = Integer.parseInt(input.nextLine());

            service.contar(primeiroNumero,segundoNumero);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Formato de número inválido: " + e.getMessage());
        }
    }
}