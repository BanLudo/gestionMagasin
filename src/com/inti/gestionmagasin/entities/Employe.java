package com.inti.gestionmagasin.entities;

public abstract class Employe {
	private int id;
	private String nom;
	private String adresse;
	private int heures;
	
	public Employe() {
		super();			// même si c'est la classe mère, il faut mettre un "super" pour dire que c'est le constructeur par défaut.
	}


	public Employe (int id, String nom, String adresse, int heures) {     // ici pas la peine de mettre un super
		super();
		this.id=id;
		this.nom=nom;
		this.adresse=adresse;
		this.heures=heures;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getHeures() {
		return heures;
	}
	public void setHeures(int heures) {
		this.heures = heures;
	}
	
//	public void AfficherEmploye () {
	//	System.out.println("id: "+id+ "\nnom : "+nom +"\nadresse: "+adresse +"\nheures:"+heures);  // ici normalement, on peut utiliser un tostring pour l'affichage.
	//}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", heures=" + heures + "]";
	}
	
	
	public boolean comparer(Employe e) {
		return (e.id == this.id && e.nom == this.nom && e.adresse.equals(this.adresse));	// ici on va comparet entre les produit que l'on entre
	} // mais ici pour comparer on aurait simplement pu s'arreter à l'id.
	
	
	public abstract float calculSalaire();		// signature
	
}// fin de code
