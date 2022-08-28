import java.util.ArrayList;
import java.util.List;

//  test case1
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//  test case2
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//  test case3
//Input: nums = [3,3], target = 6
//Output: [0,1]

public class main {
    public static int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            while(j<nums.length && nums[i] + nums[j] != target) {
                j++;
            }
            if (j<nums.length && nums[i] + nums[j] == target) {
                r[0] = i;
                r[1] = j;
                break;
            }
        }
        return r;
    }

    public static void main(String args[]){
//        int[] nums = {2,7,11,15};
//        int target = 9;
        int[] nums = {3,3};
        int target = 6;
//        Output: [0,1]
        int[] result = twoSum(nums, target);
        for(int i: result) {
            System.out.println(i);
        }
    }

}
