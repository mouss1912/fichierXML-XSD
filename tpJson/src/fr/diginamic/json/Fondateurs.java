package fr.diginamic.json;

import java.time.LocalDate;
import java.util.List;

public class Fondateurs {
	
	protected String nom;
	 protected String prenom;
	 
	 @JsonDeserialize(using = LocalDateDeserializer.class)
	 @JsonSerialize(using = LocalDateSerializer.class)
	 protected LocalDate dateDeNaissance;
	 
	 protected Lieu lieux;

	public Fondateurs(String nom, String prenom, LocalDate dateDeNaissance, Lieu lieux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.lieux = lieux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public Lieu getLieux() {
		return lieux;
	}

	public void setLieux(Lieu lieux) {
		this.lieux = lieux;
	}

	
	 
}
