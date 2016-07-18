package javaCollection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		 Set<String> set = new HashSet<String>();
		 
		 //adding to the set collection
		 set.add("Vincent");
		 set.add("Claude");
		 set.add("Pablo");
		 set.add("Leonardo");
		 set.add("Michelangelo");
		 
		 for(String list :set){
			 System.out.println(list);
		 }
		 
		 System.out.println("---After using remove()---");
		
		 //removing object
		 set.remove("Leonardo");
		System.out.println(set);

	}

}
