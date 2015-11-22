import java.util.*;

public class FruitList {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("avocado");
	
		System.out.println("The list length: " + fruits.size());
		System.out.println(fruits.toString());

		System.out.println("for method 1:");
		for(int i = 0; i < fruits.size(); i++)
			System.out.println(fruits.get(i));

		System.out.println("\nfor method 2:");
		for(String fruit : fruits)
			System.out.println(fruit);
	}
}
