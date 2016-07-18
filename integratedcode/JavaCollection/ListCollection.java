package javaCollection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListCollection {

	
	public static void main(String[] args) {
	//creating a listiterator variable
		ListIterator<String> comics = null;
	//creating an array	
		ArrayList<String> marvel= new ArrayList<String>();
		marvel.add("Spider-Man");
		marvel.add("MockingBird");
		marvel.add("Gamora");
		marvel.add("Groot");
		marvel.add(" Drax the Destroyer");
		marvel.add("Rocket Raccoon");
		//created a variable that lists the array
		comics = marvel.listIterator();
		System.out.println("Array listed in order: ");
		//as long as array marvel has elements it will print out the values
		while(comics.hasNext()){
			System.out.println(comics.next());
		}
		System.out.println("Listed in Reverse: ");
		//reversing the list
		while(comics.hasPrevious()){
			System.out.println(comics.previous());
		}
	
		
		//changing string arrays to index numbers
		
		marvel.size();
		//removing values
		marvel.remove("Spider-Man");
		marvel.remove("MockingBird");
		//lists out the new array/list
		for(String newmarvel:marvel ){
			System.out.println("Guardians of the Galaxy:" + newmarvel);
		}
		
	

	}
}