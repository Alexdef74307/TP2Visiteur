package arbrebinaire;

/**
 * Created by thomas on 23/03/16.
 */
public class VisiteurInfixe implements Visiteur {

    String result;


    @Override
    public Object visitConstante(Constante constante) {
        return String.valueOf(constante.getValeur());

    }

    @Override
    public Object visitMultiplication(Multiplication multiplication) {
        return visitOperateurBinaire(multiplication);
    }

    @Override
    public Object visitAddition(Addition addition) {
        return visitOperateurBinaire(addition);

    }

    @Override
    public Object visitNegation(Negation negation) {
        visitOperateurUnaire(negation);
        return visitOperateurUnaire(negation);

    }

    public Object visitOperateurUnaire(OperateurUnaire operateurUnaire) {
        String result = operateurUnaire.getOp().toString();
        result += String.valueOf(operateurUnaire.getOpG().accept(this));
        return result;
    }

    @Override
    public Object visitOperateurBinaire(OperateurBinaire operateurBinaire) {
        String result = "";
        result += String.valueOf(operateurBinaire.getOpG().accept(this));
        result += operateurBinaire.getOp().toString();
        result += String.valueOf(operateurBinaire.getOpD().accept(this));
        return result;
    }

}
