package Easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 3;
		nums[2] = 5;
		nums[3] = 6;
		System.out.println(searchInsert(nums, 5) + " is the index of the value 5.");
	}
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int j = 0; j < nums.length - 1; j++) {
            if ((nums[j] < target) && (nums[j+1] > target)) {
                return j+1;
            }
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        else if (target < nums[0]) {
            return 0;
        }
        return -1;
    }

}
