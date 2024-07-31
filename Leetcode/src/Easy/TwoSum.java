package Easy;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		nums[0] = 2;
		nums[1] = 7;
		nums[2] = 11;
		nums[3] = 15;
		int[] answer = twoSum(nums, 9);
		System.out.println("[" + answer[0] + ", " + answer[1] + " are the indexes of the two numbers in the array that add up to the target.");
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int [] retArr = new int [2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int k= 0; k < nums.length; k++) {
            Integer key = map.get(target - nums[k]);
            if ((key != null) && (key != k)) {
                retArr[0] = key;
                retArr[1] = k;
                break;
            }
        }
        return retArr;
    }

}
