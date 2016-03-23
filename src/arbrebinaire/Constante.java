package arbrebinaire;

public class Constante implements Noeud{
	private int valeur;
	public Constante(int v){
		valeur = v;
	}
	public int getValeur(){return valeur;}


	@Override
	public Object accept(Visiteur v) {
		return v.visitConstante(this);
	}
}
