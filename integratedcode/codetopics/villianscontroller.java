package controller;

import model.Villain;
import view.villainsview;

public class villianscontroller {
	private Villain model;
	private villainsview view;
	public villianscontroller(Villain model, villainsview view) {
		this.model = model;
	}
	public void setvillianName(String name){
		model.setName(name);
	}
	public String getvillianName(){
		return model.getName();
	}
	public void updateview(){
		view.printvillianList(model.getName());
	}

}
