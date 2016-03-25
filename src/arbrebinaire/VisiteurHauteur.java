package arbrebinaire;

/**
 * Created by thomas on 25/03/16.
 */
public class VisiteurHauteur implements Visiteur {
    @Override
    public Object visitConstante(Constante constante) {
        return 1;
    }

    @Override
    public Object visitMultiplication(Multiplication multiplication) {
        return (int)visitOperateurBinaire(multiplication) ;
    }

    @Override
    public Object visitAddition(Addition addition) {
        return (int)visitOperateurBinaire(addition) ;
    }

    @Override
    public Object visitNegation(Negation negation) {
        return (int)visitOperateurUnaire(negation);
    }

    @Override
    public Object visitOperateurUnaire(OperateurUnaire operateurUnaire) {
        int val = (int)operateurUnaire.getOpG().accept(this);

        return val + 1;
    }

    @Override
    public Object visitOperateurBinaire(OperateurBinaire operateurBinaire) {
        int brancheGauche = (Integer)operateurBinaire.getOpG().accept(this);
        int brancheDroite = (Integer)operateurBinaire.getOpD().accept(this);


        return Math.max(brancheDroite,brancheGauche) +1;
    }
}
