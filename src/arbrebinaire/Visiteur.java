package arbrebinaire;

/**
 * Created by thomas on 23/03/16.
 */
public interface Visiteur {


    public abstract Object visitConstante(Constante constante);
    public abstract Object visitMultiplication(Multiplication multiplication);
    public abstract Object visitAddition(Addition addition);
    public abstract Object visitNegation(Negation negation);

}
