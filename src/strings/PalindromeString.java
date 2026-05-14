package strings;

public class PalindromeString {

	public static void main(String[] args) {
		String word = "madama";
		String reverse = "";
		for(int i=word.length()-1; i>=0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if(reverse.equals(word)) {
			System.out.println(word + " is a Palindrome");
		}
		else {
			System.out.println(word + " is NOT a Palindrome");
		}

	}

}
