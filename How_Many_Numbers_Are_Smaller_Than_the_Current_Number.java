package LeetCodeArray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {

    public static void main(String[] args) {
    //Input: nums = [8,1,2,2,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        var map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        var result = new int[nums.length];
        for (int i =0;i<nums.length;i++){
            var count = 0;
            for (var element : map.entrySet()){
                if(nums[i] > element.getKey()){
                    count += element.getValue();
                }
            }
            result[i]=count;
        }
        return result;
    }
}
