import java.util.*;
import java.io.*;

public class Grocery {
	public static void main(String[] args) {
		Map<String, Double> groceryList = new HashMap<String, Double>();
		Double amount = 0.0;
		String item, answer = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Weekly Grocery List");
		System.out.println("-------------------");
		
		try {
			do {
				System.out.print("Type item you want to buy: ");
				item = br.readLine();
				System.out.print("Type how many items: ");
				amount = Double.parseDouble(br.readLine());	
				System.out.print("Do you want add more items to the List? (y/n)");
				answer = br.readLine();
				groceryList.put(item, amount);
			} while (answer.equals("y"));

		}
		catch(IOException e) {
			e.printStackTrace();
		}

		if(groceryList.size() > 0)
			for(String product : groceryList.keySet())
				System.out.println("Item " + product + " - " + groceryList.get(product).toString() + " units");
		else
			System.out.println("Your list is empty! :/");
	}
}
