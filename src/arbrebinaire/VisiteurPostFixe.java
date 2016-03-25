package arbrebinaire;

/**
 * Created by thomas on 23/03/16.
 */
public class VisiteurPostFixe implements Visiteur {


    String result;

    public VisiteurPostFixe(){
        this.result ="";
    }

    @Override
    public Object visitConstante(Constante constante) {
        this.result += String.valueOf(constante.getValeur());
        return constante.getValeur();
    }

    @Override
    public Object visitMultiplication(Multiplication multiplication) {

        int v[] = (int[])visitOperateurBinaire(multiplication);
        return v[0]*v[1];
    }


    @Override
    public Object visitAddition(Addition addition) {
        int v[] = (int[])visitOperateurBinaire(addition);
        return v[0]+v[1];
    }


    @Override
    public Object visitNegation(Negation negation) {
        int i = (int)visitOperateurUnaire(negation);
        return -i;
    }


    public Object visitOperateurUnaire(OperateurUnaire operateurUnaire) {
        int val = (Integer)operateurUnaire.getOpG().accept(this);
        this.result += operateurUnaire.getOp();
        return val;
    }

    public Object visitOperateurBinaire(OperateurBinaire operateurBinaire) {
        int v[] = new int[2];
        v[0] = (Integer)operateurBinaire.getOpG().accept(this);
        v[1] = (Integer)operateurBinaire.getOpD().accept(this);
        this.result += operateurBinaire.getOp();
        return v;

    }
}
