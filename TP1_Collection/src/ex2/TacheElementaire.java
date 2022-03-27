package ex2;

public class TacheElementaire implements Tache {
	
	private String nom;
	private int cout;

	public TacheElementaire(String nom, int cout) {
		super();
		this.nom = nom;
		this.cout = cout;
	}
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getCout() {
		return cout;
	}

}
