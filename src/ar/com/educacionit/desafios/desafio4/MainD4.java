package ar.com.educacionit.desafios.desafio4;


public class MainD4 {

	public static void main(String[] args) {
		CustomList<String> myList = new CustomList<>();
		System.out.println(myList.size()); 
		
	
		myList.addLast("Sarasaaaa");
		System.out.println(myList.size()); 
		
		myList.showValues();
		
		myList.addFirst("yo soy el primero!");
		myList.addFirst("no, yo!");
		myList.addFirst("jajaja no! yo soy el primero!");
				
		myList.showValues();
		myList.remove("Sarasaaaa");
		myList.showValues();
		
		myList.removeAll();
		System.out.println("ahora se supone que esta vacio... ");
		myList.showValues();
		
		/*
		 * MyCustomList<String> my = new MyCustomList<>();
		 * 
		 * String one = "test"; String two = "test1"; String three = "test2"; String
		 * four = "test3"; String five = "some test to insert first";
		 * 
		 * my.add(one); my.add(two); my.add(three); my.add(four);
		 * 
		 * my.addFirst(five); System.out.println(my.remove(five));
		 * 
		 * MyCustomList<String>someOtherList = new MyCustomList<>();
		 * someOtherList.add(one);
		 * 
		 * someOtherList.remove(one); System.out.println(someOtherList.size());
		 */

	}

}
