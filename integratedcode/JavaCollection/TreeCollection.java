package javaCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeCollection {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		//adding to Collection
		tree.add("Vincent");
		tree.add("Claude");
		tree.add("Leonardo");
		tree.add("Pablo");
		tree.add("Michelangelo");
		
		Iterator iterator;
		iterator = tree.iterator();
		
		while (iterator.hasNext()){
			   System.out.println(iterator.next() + " ");
			   }
		
		System.out.println("---After using remove()---");
		
		tree.remove("Claude");
		System.out.println(tree);
	}

}
