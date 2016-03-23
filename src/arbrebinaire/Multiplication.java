package arbrebinaire;

public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	public Object accept(Visiteur v) {
		return v.visitMultiplication(this);
	}

}
