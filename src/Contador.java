import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Digite o primeiro número: ");
            int primeiroNumero = Integer.parseInt(input.nextLine());

            System.out.println("Digite o segundo número: ");
            int segundoNumero = Integer.parseInt(input.nextLine());

            contar(primeiroNumero,segundoNumero);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Formato de número inválido: " + e.getMessage());
        }
    }
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        int contagem = segundoParametro - primeiroParametro;

        if (contagem >= 0){
            for(int i = 1; i <= contagem; i++){
                System.out.println("Número: " + i);
            }
        }else{
            throw new ParametrosInvalidosException(primeiroParametro, segundoParametro);
        }
    }
}