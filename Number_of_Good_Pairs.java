package LeetCodeArray;

public class Number_of_Good_Pairs {

    public static void main(String[] args) {
    //Input: nums = [1,2,3,1,1,3]
    //Output: 4
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        var count = 0;
        for(int i=0; i<nums.length-1;i++){
            for(int j = 1 ; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}
