package strings;

public class PalindromeInteger {

	public static void main(String[] args) {
		int num = 12321;
		int original = num;
		int rev = 0;
		while (num > 0) {
			int lastNum = num % 10;
			rev = lastNum + rev*10;
			num = num / 10;
		}
		//System.out.println(rev);
		if(rev==original) {
			System.out.println(original + " is Palindrome");
		}
		else {
			System.out.println(original + " is NOT Palindrome");
		}
	}

}
