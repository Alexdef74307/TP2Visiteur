package arbrebinaire;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
		VisiteurPostFixe visiteurPostFixe = new VisiteurPostFixe();
		racine.accept(visiteurPostFixe);
		System.out.println("Affichage du visiteur PostFixe : " + visiteurPostFixe.result);
		// TODO 
		
	}

	public int calculerValeur() {
		System.out.println("\n calcul Valeur");
		VisiteurPostFixe visiteurPostFixe = new VisiteurPostFixe();
		int v = (Integer)racine.accept(visiteurPostFixe);
		System.out.println("Affichage de la valeur de l'arbre : " + v);
		return 0;
	}

	public int calculerHauteur() {
		// TODO 
		return 0;
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		// TODO 
		
	}
	
}
