package task3;

public class Largest_Smallest_String {

	public static void main(String[] args) {
		String sentence = "Let the skyfall when it crumbles we will stand tall face it all together";
		Largest_and_smallest(sentence);

	}

	private static void Largest_and_smallest(String sentence) {
		if(sentence == null || sentence.isEmpty()) {
			System.out.println("the input is empty or null");
		}
		
		String[] words = sentence.split("\\s+");
		String largest = words[0];
		String smallest = words[0];
		
		for(String word : words) {
			if(word.length() > largest.length()) {
				largest = word;
			}
			if(word.length() < smallest.length()) {
				smallest = word;
			}
		}
		System.out.println("largest : " + largest );
		System.out.println("smallest : " + smallest);
		
	}

}
