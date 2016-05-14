package comic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//This code is to annotate the superhero class -> superhero table in mysql
@Entity
@Table(name="superhero")
public class SuperHero {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="alias")
	private String alias;
	
	@Column(name="firstName")
	private String firstname;
	
	@Column(name="lastName")
	private String lastname;
	
	@Column(name="specialAbility")
	private String specialability;
	public SuperHero() {
		
	}
	public SuperHero(String alias, String firstname, String lastname, String specialability) {
		super();
		this.alias = alias;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialability = specialability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSpecialability() {
		return specialability;
	}
	public void setSpecialability(String specialability) {
		this.specialability = specialability;
	}

}
