package LeetCodeArray;

import java.util.Arrays;

public class Shuffle_the_Array {

    public static void main(String[] args) {
    //Input: nums = [2,5,1,3,4,7], n = 3
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        var result = new int[nums.length];
        int j=n;
        for(int i= 0;i<n;i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[j];
            j++;
        }
        return result;
    }
}
