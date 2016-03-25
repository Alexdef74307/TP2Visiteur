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
		System.out.println("\n Calcul Valeur");
		VisiteurPostFixe visiteurPostFixe = new VisiteurPostFixe();
		int v = (Integer)racine.accept(visiteurPostFixe);
		System.out.println("Affichage de la valeur de l'arbre : " + v);
		return 0;
	}

	public int calculerHauteur() {
		System.out.println("\n Calcul de la hauteur");
		VisiteurHauteur visiteurHauteur = new VisiteurHauteur();
		int v = (int)racine.accept(visiteurHauteur);
		System.out.println("\n Affichage de la hauteur de l'arbre");
		return v;
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		// TODO 
		
	}
	
}
