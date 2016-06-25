package javaCollection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Threads {

	public static void main(String arg[]) {
//I took my code I created in lists_iterator.java and created a thread/runnable code.		
		Thread t = new Thread(){
			
			public void run(){
				ListIterator<String> comics = null;
				ArrayList<String> marvel= new ArrayList<String>();
				marvel.add("Spider-Man");
				marvel.add("MockingBird");
				marvel.add("Gamora");
				marvel.add("Groot");
				marvel.add(" Drax the Destroyer");
				marvel.add("Rocket Raccoon");
				comics = marvel.listIterator();
				while(comics.hasNext()){
					System.out.println(comics.next());
				}
				try {
					sleep(90);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
	t.start();
//while the above code is running the code below will run at the same time just 90 milliseconds behind each other	
	Thread anotherone = new Thread(){
		
		public void run(){
			ListIterator<String> comics = null;
			ArrayList<String> marvel= new ArrayList<String>();
			marvel.add("Doctor Doom");
			marvel.add("Magneto");
			marvel.add("Norman Osborn");
			marvel.add("Red Skull");
			marvel.add("Loki");
			marvel.add("Mystique");
			comics = marvel.listIterator();
			while(comics.hasNext()){
				System.out.println(comics.next());
			}
			try {
				sleep(90);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
anotherone.start();
	}
	
}
