import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo número: ");
        int segundoNumero = Integer.parseInt(input.nextLine());

        try{
            contar(primeiroNumero,segundoNumero);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
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