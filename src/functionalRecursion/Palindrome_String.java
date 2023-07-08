package functionalRecursion;

public class Palindrome_String {
	static boolean isPalindrome(String str,int start) {
		int n = str.length();
		if(start >= n/2) {
			return true;
		}
		if(str.charAt(start) != str.charAt(n-start-1)) {
			return false;
		}else {
			return isPalindrome(str, start+1);
		}
		
	}

	public static void main(String[] args) {
		String str = "MADAM";
		System.out.println(isPalindrome(str, 0));

	}

}
