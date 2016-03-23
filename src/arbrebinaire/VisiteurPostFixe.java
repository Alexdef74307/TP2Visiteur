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
    public void visitConstante(Constante constante) {
        this.result += String.valueOf(constante.getValeur());
    }

    @Override
    public void visitOperateurUnaire(OperateurUnaire operateurUnaire) {
        operateurUnaire.getOpG().accept(this);
        this.result += operateurUnaire.getOp();
    }

    @Override
    public void visitOperateurBinaire(OperateurBinaire operateurBinaire) {
        operateurBinaire.getOpG().accept(this);
        operateurBinaire.getOpD().accept(this);
        this.result += operateurBinaire.getOp();
    }
}
