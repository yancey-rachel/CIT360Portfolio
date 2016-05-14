package comic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="villains")
public class villains {
		
		
			@Id
			@Column(name="id")
			private int id;
			
			@Column(name="alias")
			private String alias;
			
			@Column(name="Firstname")
			private String Firstname;
			
			@Column(name="Lastname")
			private String Lastname;
			
			@Column(name="abilities")
			private String abilities;
			public villains() {
				
			}
	

	public static void main(String[] args) {
		

	}


	public villains(String alias, String firstname, String lastname, String abilities) {
		super();
		this.alias = alias;
		Firstname = firstname;
		Lastname = lastname;
		this.abilities = abilities;
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
		return Firstname;
	}


	public void setFirstname(String firstname) {
		Firstname = firstname;
	}


	public String getLastname() {
		return Lastname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public String getAbilities() {
		return abilities;
	}


	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}

}
