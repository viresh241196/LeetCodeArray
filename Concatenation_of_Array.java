package LeetCodeArray;

import java.util.Arrays;

public class Concatenation_of_Array {


    public static void main(String[] args) {
        //Input: nums = [1,2,1]
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }
    public static int[] getConcatenation(int[] nums) {
        var result = new int[(2*nums.length)];
        for(int i =0;i<nums.length;i++){
            result[i]= nums[i];
            result[i+nums.length]= nums[i];
        }
        return result;
    }
}
