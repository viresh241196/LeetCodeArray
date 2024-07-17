package LeetCodeArray;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {

    public static void main(String[] args) {
    //Input: nums = [1,2,3,4]
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }

    public static int[] runningSum(int[] nums) {
        var result = new int[nums.length];
        var count = 0;
        for(int i = 0 ;i<nums.length;i++){
            count += nums[i];
            result[i] = count;
        }
        return result;
    }
}
