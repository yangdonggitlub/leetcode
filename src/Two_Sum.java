/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *You may assume that each input would have exactly one solution. 
 */
public class Two_Sum {
	 public static int[] twoSum(int[] nums, int target) {
		 if(nums == null)
			 return null;
		 for(int i = 0;i < nums.length;i++)
		 {
			 if(nums[i] >= target)
			 {
				 continue;
			 }
			 for(int j = 0;j<nums.length;j++)
			 {
				 if(i == j)
				 continue;
				 if(nums[j] == (target-nums[i]))
				 {
					 int[] result = new int[]{0,0};
					 result[0] = i;
					 result[1] = j;
					 return result;
				 }
			 }
		 }
		return null;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a);
		int[] a = new int[]{3,2,4};
		System.out.print(twoSum(a,6)[1]);
	}

}
