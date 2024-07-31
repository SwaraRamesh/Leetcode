package Easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		System.out.println(isPalindrome(num) + ", " + num + " is a valid palindrome");
	}
    public static boolean isPalindrome(int x) {
        String newNum = "";
        String num = x+"";
        for (int i = num.length() - 1; i >= 0; i--) {
            newNum += num.substring(i);
            num = num.substring(0, i);
        }
        return newNum.equals(x+"");
	}
}
