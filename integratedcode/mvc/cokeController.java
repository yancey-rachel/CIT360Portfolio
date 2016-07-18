package control;

import model.Coke;
import view.Cokeview;

public class cokeController {

	private Coke model;
	private Cokeview view;
	
	public cokeController(Coke model, Cokeview view){
		this.model = model;
		this.view = view;
	}
	
	public void setcokeFlavor( String flavor){
		model.Setflavor(flavor);
	}
	
	public String getcokeFlavor(){
		return model.Getflavor();
	}
	
	public void setcokeSize(int size){
		model.Setsize(size);
		
	}
	
	public int GetcokeSize(){
		return model.Getsize();
	}
	
	public void uview(){
		view.printcokedata(model.Getflavor(), model.Getsize());
	}
	
}
