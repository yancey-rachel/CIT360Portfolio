package model;

import controller.villianscontroller;
import model.Villain;
import view.villainsview;
public class mvc {

	public static void main (String[]args) {
		Villain model = villainList();
		
		villainsview view = new villainsview();
		
		villianscontroller controller = new villianscontroller(model, view);
		
		controller.setvillianName("Magneto");
		
		controller.updateview();
		
		
	}
   private static Villain villainList(){
	   Villain villain = new Villain ();
	   villain.setName("Loki");
	   return villain;
			   
   }
	
}
