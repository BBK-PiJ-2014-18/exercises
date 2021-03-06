public class TreeIntSortedListScript {

	public static void main (String[] args) {
	
		TreeIntSortedListScript tisls = new TreeIntSortedListScript();
		tisls.launch();			
	}

	public void launch() {

		TreeIntSortedList tisl = new TreeIntSortedList(50);
		tisl.add(40);
		tisl.add(30);
		tisl.add(60);
		tisl.add(20);
		tisl.add(70);
		tisl.add(80);
		tisl.add(10);
		tisl.add(90);
		
				
		System.out.println();
		System.out.println();
		System.out.println("=== PRINT LIST ===");
		String result = tisl.toString();
		System.out.println(result);
		System.out.println();

		System.out.println("=== CHECK FOR CONTAINS ===");
		System.out.println("contains 30: " +  tisl.contains(30));
		System.out.println("contains 35: " +  tisl.contains(35));


		System.out.println("=== TRY ADDING DUPLICATES 30, 60, 20 ===");
		tisl.add(30);
		tisl.add(60);
		tisl.add(20);
		System.out.println();
		System.out.println("=== PRINT LIST ===");
		result = tisl.toString();
		System.out.println(result);
		System.out.println();


		
		

	}
}