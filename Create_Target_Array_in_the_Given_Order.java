package LeetCodeArray;

import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {


    public static void main(String[] args) {
    //input nums = [0,1,2,3,4], index = [0,1,2,2,1]
    //Output: [0,4,1,3,2]
        System.out.println(Arrays.toString(createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        var array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                for (int j = i; j > index[i]; j--) {
                    array[j] = array[j - 1];
                }
            }
            array[index[i]] = nums[i];
        }
        return array;

    }
}
