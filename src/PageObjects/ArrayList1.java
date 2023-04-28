package PageObjects;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		// Declare Arraylist heterogenous type
		ArrayList al = new ArrayList();
		// ArrayList<String> al = new ArrayList<String>(); //Arraylist with homogenous
		// data
		al.add(100);
		al.add("Sid");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println("Elements in Arralist are:" + al);// [100, Sid, 15.5, A, true]
		// Size
		System.out.println("Num. of elements in Arraylist:" + al.size());

		System.out.println("***Removing elements***");
		al.remove(1);// index wise(here 1 is index)
		al.remove(15.5);// Element wise(15.5 is an element)
		System.out.println("After removing elements in Arraylist:" + al);// [100, A, true]
		System.out.println("Num. of elements in Arraylist:" + al.size());

		System.out.println("***Adding elements***");
		al.add(1, "Sid");// Index wise(here 1 is index and sid is elemnt)
		al.add(2, 15.5);
		al.add("Ank");// Adding new element
		System.out.println("After adding elements in Arraylist:" + al);// [100, Sid, 15.5, A, true, Ank]
		System.out.println("Num. of elements in Arraylist:" + al.size());// 6

		System.out.println("***Retriving specific element from list***");
		System.out.println(al.get(5));// Ank

		// Update/Change element
		al.set(3, "Kunu"); //Here 3 is Index
		System.out.println("After updating elements in Arraylist:" + al);// [100, Sid, 15.5, Kunu, true, Ank]

		System.out.println("*** Searching an element in arraylist using contains()***");
		System.out.println(al.contains("Kunu"));// true
		System.out.println(al.containsAll(al));// true

		// isEmpty()
		System.out.println(al.isEmpty());// false

		System.out.println("*** Iterating elements in Arraylist using for loop***");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("*** Iterating elements in Arraylist using for Each loop***");

		for (Object e : al) {
			System.out.println(e);
		}

		System.out.println("*** Iterating elements in Arraylist using Iterator***");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
