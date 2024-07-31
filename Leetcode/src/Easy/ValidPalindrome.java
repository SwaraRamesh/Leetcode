package Easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama") + "- A man, a plan, a canal: Panama- is a valid palindrome.");
	}
	
    public static boolean isPalindrome(String s) {
        String s2 = "";
        String og = "";
        char [] arr = s.toLowerCase().toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Character.isDigit(arr[i]) || Character.isLetter(arr[i])) {
                s2 += arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (Character.isDigit(arr[j]) || Character.isLetter(arr[j])) {
                og += arr[j];
            }
        }
        return og.equals(s2);
	}

}
