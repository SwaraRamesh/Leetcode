package Easy;

public class ThreeConsecutiveOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		arr[0] = 2;
		arr[1] = 6;
		arr[2] = 4;
		arr[3] = 1;
		System.out.println(threeConsecutiveOdds(arr) + ", there are no three consecutive odds.");
	}

    public static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] % 2 == 1) && (arr[i+1] % 2 == 1) && (arr[i+2] % 2 == 1)) {
                return true;
            }
        }
        return false;
	}
}
