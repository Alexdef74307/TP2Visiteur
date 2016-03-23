package arbrebinaire;

/**
 * Created by thomas on 23/03/16.
 */
public class VisiteurPrefixe implements Visiteur {
    @Override
    public Object visitConstante(Constante constante) {

        return null;
    }

    @Override
    public Object visitMultiplication(Multiplication multiplication) {
        return null;
    }

    @Override
    public Object visitAddition(Addition addition) {
        return null;
    }

    @Override
    public Object visitNegation(Negation negation) {
        return null;
    }

    public Object visitOperateurUnaire(OperateurUnaire operateurUnaire) {

        return null;
    }

    public Object visitOperateurBinaire(OperateurBinaire operateurBinaire) {

        return null;
    }
}
