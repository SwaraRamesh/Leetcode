package Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 1;
		System.out.print(containsDuplicate(nums) + ", [");
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.print(nums[nums.length - 1] + "] contains a duplicate.");
	}
	
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return nums.length != set.size();
    }
}
