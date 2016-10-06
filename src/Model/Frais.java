package Model;

import java.util.Date;
import java.util.Vector;

/**
 * Classe Model.Frais
 * 
 * @author etienne
 *
 */
public class Frais {

	private Integer IdFrais;
	private Date DateAnnee;
	private Float Montant;
	private String Description;

	public Frais() {
	}

	public Frais(Integer aIdFrais, Date aDateAnnee, Float aMontant, String aDescription) {
		this.IdFrais = aIdFrais;
		this.DateAnnee = aDateAnnee;
		this.Montant = aMontant;
		this.Description = aDescription;
	}

	public void SetIdFrais(Integer IdFrais) {
		this.IdFrais = IdFrais;
	}

	public Integer GetIdFrais() {
		return IdFrais;
	}

	public void SetDateAnnee(Date aDateAnnee) {
		this.DateAnnee = aDateAnnee;
	}

	public Date GetDateAnnee() {
		return DateAnnee;
	}

	public void SetMontant(Float aMontant) {
		this.Montant = aMontant;
	}

	public Float GetMontant() {
		return Montant;
	}

	public void SetDescription(String aDescription) {
		this.Description = aDescription;
	}

	public String GetDescription() {
		return Description;
	}

	public String toString() {
		return this.DateAnnee + " " + this.Montant + " " + this.Description;
	}
}