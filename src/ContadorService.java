public class ContadorService {
     void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
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
