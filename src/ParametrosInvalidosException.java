public class ParametrosInvalidosException extends Exception{
    private int cod;

    public ParametrosInvalidosException(String message, int cod) {
        super(message);
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }
}
