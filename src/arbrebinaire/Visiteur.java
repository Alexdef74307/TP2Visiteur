package arbrebinaire;

/**
 * Created by thomas on 23/03/16.
 */
public interface Visiteur {


    public abstract void visitConstante(Constante constante);
    public abstract void visitOperateurUnaire(OperateurUnaire operateurUnaire);
    public abstract void visitOperateurBinaire(OperateurBinaire operateurBinaire);

}
