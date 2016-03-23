package arbrebinaire;

public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}

	public Object accept(Visiteur v) {
		return v.visitNegation(this);
	}
}
