package LeetCodeArray;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {

    public static void main(String[] args) {
        //Input: nums = [1,2,3,4,5,6]
        //Output: 3
        System.out.println(minimumOperations(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static int minimumOperations(int[] nums) {
        var count = 0;
        for (int num : nums){
            if((num+1)%3 == 0){
                count++;
            }else if((num-1)%3 == 0){
                count++;
            }
        }
        return count;
    }
}
