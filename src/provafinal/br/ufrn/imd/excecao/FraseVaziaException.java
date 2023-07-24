package provafinal.br.ufrn.imd.excecao;


public class FraseVaziaException extends Exception {
    private static final long serialVersionUID = 1L;

	public FraseVaziaException() {
        super();
    }
	

    public FraseVaziaException(String message) {
        super(message);
    }
}

