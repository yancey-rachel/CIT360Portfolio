package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Coke_serialization implements Serializable {
	public String companyName;
	public String flavor1;
	public String flavor2;
	public String flavor3;
	public String flavor4;
	
	public String getcompanyName(){
		return companyName;
	}
	
	public void setcompanyName (String companyName){
		this.companyName = companyName;
	}
	
	public String getflavor1(){
		return flavor1;
	}
	
	public void setflavor1(String flavor1){
		this.flavor1 = flavor1;
	}
	
	
	public String getflavor2(){
		return flavor2;
	}
	
	public void setflavor2(String flavor2){
		this.flavor2 = flavor2;
	}
	
	public String getflavor3(){
		return flavor3;
	}
	
	public void setflavor3(String flavor3){
		this.flavor3 = flavor3;
	}
	public String getflavor4(){
		return flavor4;
	}
	
	public void setflavor4(String flavor4){
		this.flavor4 = flavor4;
	}
	
	public void viewcokeflavors(){
		System.out.println("Company Name: " + this.companyName);
		System.out.println("Flavor: " + this.flavor1 );
		System.out.println("Flavor: " + this.flavor2 );
		System.out.println("Flavor: " + this.flavor3 );
		System.out.println("Flavor: " + this.flavor4 );
	}
	
}

