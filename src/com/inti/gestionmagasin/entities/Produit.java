package com.inti.gestionmagasin.entities;

public class Produit {

	private long id;
	private String Libelle;
	private String Marque;
	private float Prix;
	static int nbrProduit;
														
	
	
	// un produit vide p1
		public Produit() {}
		
	//	pour le cas a et b
		public Produit(long id, String Libelle, String Marque) {
			this.id=id;
			this.Libelle=Libelle;
			this.Marque=Marque;
			nbrProduit++;
		}

	// pour le cas c) avec la tomate heinz				//nous permet de faire appeler et afficher noms des aliments
		public Produit(long id, String Libelle, String Marque, float prix) {
			this.id=id;
			this.Libelle=Libelle;
			this.Marque=Marque;
			this.Prix=prix;
		}

		public void afficher() {
			System.out.println("Produit:\n" +"identifiant"+id +"Libellé"+Libelle +"Marque"+Marque + "Prix : "+Prix);
		}

		@Override
		public String toString() {
			return "Produit [id=" + id + ", Libelle=" + Libelle + ", Marque=" + Marque + "]";
		}  // méthode prédéfinie qui appartient à Java..
		
		
		
		public boolean comparer(Produit p) {
			return (p.id == this.id && p.Prix == this.Prix && p.Libelle.equals(this.Libelle));		// ici on va comparet entre les produit que l'on entre
		}																							// et les produits qui existent
		

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getLibelle() {
			return Libelle;
		}

		public void setLibelle(String libelle) {
			Libelle = libelle;
		}

		public String getMarque() {
			return Marque;
		}

		public void setMarque(String marque) {
			Marque = marque;
		}

		public float getPrix() {
			return Prix;
		}

		public void setPrix(float prix) {
			Prix = prix;
		}
		
		
		
		
		/*static int min(int a, int b) {
			if (a<b) {
				return a;
			}else {
				return b;
			}
		}*/
		
		
		
}
