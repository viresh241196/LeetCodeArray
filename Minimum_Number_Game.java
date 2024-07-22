package LeetCodeArray;

import java.util.Arrays;

public class Minimum_Number_Game {

    public static void main(String[] args) {
    //nums =
        //[5,4,2,3]
        System.out.println(Arrays.toString(numberGame(new int[]{5, 4, 2, 3})));

    }

    public static int[] numberGame(int[] nums) {
        var result = new int[nums.length];
        Arrays.sort(nums);
        for(int i =0; i<nums.length;i++){
            if(i %2 == 0){
                result[i+1] = nums[i];
            }else {
                result[i-1] = nums[i];
            }
        }
        return result;
    }
}
