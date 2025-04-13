public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(int primeiroNumero, int segundoNumero){
        super("O primeiro parametro: " + primeiroNumero + " é maior que o segundo: " + segundoNumero);
    }
}
