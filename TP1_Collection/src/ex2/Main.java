package ex2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Tache> al = new ArrayList();
		
		Tache t1 = new TacheElementaire("tache1",1);
		Tache t2 = new TacheElementaire("tache2",2);
		Tache t3 = new TacheElementaire("tache3",3);
		
		Tache t4 = new TacheElementaire("tache4",4);
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		TacheComplexe TC = new TacheComplexe(al,"TC1",0);
		
		System.out.println(TC.toString());
		
		System.out.println("Cout total des taches : "+TC.getCout());
		
		TC.ajouter(t4);
		System.out.println(TC.toString());
		
		TC.supprimer(t4);
		System.out.println(TC.toString());
	}

}
