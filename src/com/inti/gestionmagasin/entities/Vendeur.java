package com.inti.gestionmagasin.entities;

public class Vendeur extends Employe {
	private float Taux_Vente;
	
	public Vendeur() {
		super();			//appel constructeur par défaut de la classe mere
	}
	
	public Vendeur(int id, String nom, String adresse, int heures, float Taux_Vente) {
		super(id, nom, adresse, heures);
		this.Taux_Vente=Taux_Vente;
		}



	public float getTaux_Vente() {
		return Taux_Vente;
	}

	public void setTaux_Vente(float taux_Vente) {
		Taux_Vente = taux_Vente;
	}

	@Override
	public String toString() {
		return "Vendeur: \n\n"+ super.toString()+ "Numero de caisse: " + Taux_Vente + "]";
	}

	@Override
	public float calculSalaire() {
		return 1600*Taux_Vente;
	}
	

	
}// fin de code
