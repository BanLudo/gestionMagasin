package com.inti.gestionmagasin.entities;

// import com.inti.gestionmagasin.entities.Produit;

public class ProduitAlimentaire {   
	//	long Indentifiant;				// string n'est pas en couleurs car ce n'est pas un primitif
	//	String Libelle;
	//	String Marque;					/* nous permets d'écrire des commentaires sur toutes les lignes */
	//	float Prix;   /
		
		public static void main (String[] args) {
			
			Produit p1=new Produit();
			Produit p2=new Produit(1021, "Lait", "Lactel");
			Produit p3=new Produit(2510, "Yaourt", "Danone");
			Produit p4=new Produit(3250, "Tomate", "Heinz", 2.2f);
			
	// ------ Ici on va realiser un polymorphisme... on va définir les caissiers comme des employés en appelant la classe "Employe" mais en faisant "new Caissier"		
			Employe caissier1=new Caissier(1, "caissier 1", "Paname", 160, 124);     
			Employe caissier2=new Caissier(2, "caissier 2", "Paname", 180, 123);
			Employe caissier3=new Caissier(3, "caissier 3", "Paname", 170, 121);
			
			Employe vendeur1=new Vendeur(1, "vendeur1", "Paris", 120, 15f);
			Employe vendeur2=new Vendeur(2, "vendeur2", "Paris", 130, 20f);
			Employe vendeur3=new Vendeur(3, "vendeur3", "Paris", 140, 25f);
			Employe vendeur4=new Vendeur(4, "vendeur4", "Paris", 150, 30f);
			
			Employe responsable1=new Responsable();
			Employe responsable2=new Responsable();
			
			
			
			Magasin T = new Magasin(2, "carrefour", "Tours");
			T.ajouterEmploye(caissier1);
			T.ajouterEmploye(caissier2);
			T.ajouterEmploye(vendeur1);
			T.ajouterEmploye(responsable1);
			T.ajouter(p1);
			T.ajouter(p2);
			T.afficher();
			
			
			
			Magasin C = new Magasin(3, "Monoprix", "Courbevoie");
			C.ajouterEmploye(caissier3);
			C.ajouterEmploye(vendeur2);
			C.ajouterEmploye(vendeur3);
			C.ajouterEmploye(vendeur4);
			C.ajouterEmploye(responsable2);
			C.ajouter(p2);
			C.ajouter(p3);
			C.ajouter(p4);
			C.afficher();
			
			
			System.out.println("***");
			System.out.println("Calcul des salaires");
			System.out.println("***");		
			
			
			System.out.println("Le salaire du caissier n°1 est:"+caissier1.calculSalaire()+"$");
			System.out.println("Le salaire du caissier n°2 est:"+caissier2.calculSalaire()+"$");
			System.out.println("Le salaire du caissier n°3 est:"+caissier3.calculSalaire()+"$");
			System.out.println("Le salaire du vendeur n°1 est:"+vendeur1.calculSalaire()+"$");
			System.out.println("Le salaire du vendeur n°2 est:"+vendeur2.calculSalaire()+"$");
			System.out.println("Le salaire du vendeur n°3 est:"+vendeur3.calculSalaire()+"$");
			System.out.println("Le salaire du vendeur n°4 est:"+vendeur4.calculSalaire()+"$");
			
			
	/*		p1.afficher();
			
			System.out.println(p1.toString());
			
			
			p2.afficher();
			System.out.println(p2.toString());
			
			
			p3.afficher();
			System.out.println(p3.toString());
			System.out.println("variable statique est:"+Produit.nbrProduit);
			
			
			p4.afficher();
			System.out.println(p4.toString());
			
		//	int x = Produit .min(21, 4);
		//	System.out.println(x);
		/*	Magasin m=new Magasin(1, "Franprix", "Tours");
		m.ajouter(p1);
		m.ajouter(p2);
		m.ajouter(p3);
		m.ajouter(p4);
		m.afficher(); */

		
			
			
			
		
		}
} //fin de code