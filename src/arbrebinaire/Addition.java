package arbrebinaire;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	public Object accept(Visiteur v) {
		return v.visitAddition(this);
	}



}
