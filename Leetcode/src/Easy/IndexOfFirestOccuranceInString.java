package Easy;

public class IndexOfFirestOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStr(haystack, needle) + " is the index of the first occurance of " + needle + ".");
	}
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
