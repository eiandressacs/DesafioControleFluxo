public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Erro: O segundo parâmetro deve ser maior ou igual ao primeiro.");
    }
} 