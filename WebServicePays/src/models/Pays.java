package models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the pays database table.
 * 
 */
@Entity
@Table(name="pays")
public class Pays implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOM_PAYS")
	private String nomPays;

	@Column(name="NB_HABITANTS")
	private BigInteger nbHabitants;

	@Column(name="NOM_CAPITALE")
	private String nomCapitale;

	@Column(name="NOM_CONTINENT")
	private String nomContinent;

	public Pays() {
	}

	public String getNomPays() {
		return this.nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public BigInteger getNbHabitants() {
		return this.nbHabitants;
	}

	public void setNbHabitants(BigInteger nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public String getNomCapitale() {
		return this.nomCapitale;
	}

	public void setNomCapitale(String nomCapitale) {
		this.nomCapitale = nomCapitale;
	}

	public String getNomContinent() {
		return this.nomContinent;
	}

	public void setNomContinent(String nomContinent) {
		this.nomContinent = nomContinent;
	}

}