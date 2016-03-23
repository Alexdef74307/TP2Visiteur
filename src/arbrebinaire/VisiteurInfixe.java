package arbrebinaire;

/**
 * Created by thomas on 23/03/16.
 */
public class VisiteurInfixe implements Visiteur {

    int result;
    int resultTemp;

    @Override
    public Object visitConstante(Constante constante) {
        resultTemp += constante.getValeur();
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
        resultTemp = -resultTemp;

        return null;
    }

    /*public Object visitOperateurBinaire(OperateurBinaire operateurBinaire) {
        resultTemp = operateurBinaire.getOpG().accept(this);

        switch(operateurBinaire.getOp()){
            case "+" :

                break;
            case "*" :
                break;
        }
        result += resultTemp;
    }*/
}
