package Easy;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums  = new int[6];
		nums[0] = -1;
		nums[1] = 0;
		nums[2] = 3;
		nums[3] = 5;
		nums[4] = 9;
		nums[5] = 12;
		int target = 9;
		System.out.println(search(nums, 9) + " is the index of " + target + ".");
	}
	
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        if ((nums[nums.length - 1] < target) || (nums[0] > target)) {
            return -1;
        }
        while (start <= end) {
            int mid = (start+end)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return -1;
	}

}
