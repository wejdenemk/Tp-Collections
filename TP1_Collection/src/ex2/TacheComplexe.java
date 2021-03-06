package ex2;

import java.util.ArrayList;

public class TacheComplexe implements Tache {
	
	private String nom;
	private int cout;
	ArrayList<Tache> list = new ArrayList<>();

	public TacheComplexe(ArrayList<Tache> list, String nom, int cout) {
		super();
		this.list = list;
		this.nom = nom;
		this.cout = cout;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getCout() {
		int c=0;
		for(int i=0;i<list.size();i++) {
			c = c + list.get(i).getCout();
		}
		return c;
	}
	
	public void ajouter(Tache t){
		list.add(t);
	}
	
	public void supprimer(Tache t){
		list.remove(t);
	}

	@Override
	public String toString() {
		return "TacheComplexe [nom=" + nom + ", cout=" + cout + ", list=" + list + "]";
	}
	
	

}
