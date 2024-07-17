package LeetCodeArray;

import java.util.List;

public class sum_of_values_at_indices_with_k_set_bits {

    public static void main(String[] args) {
        //Input: nums = [5,10,1,5,2], k = 1
        //nums = [4,3,2,1], k = 2
        System.out.println(sumIndicesWithKSetBits(List.of(4,3,2,1), 2));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        var result = 0;
        for(int i=0;i<nums.size();i++){
            if(countBits(i) == k) result +=nums.get(i);
        }
        return result;
    }

    public static int countBits(int num){
        var count = 0;
        while(num!=0){
            count += (num&1);
            num = num>>1;
        }
        return count;
    }
}
