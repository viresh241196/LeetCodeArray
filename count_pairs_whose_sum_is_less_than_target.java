package LeetCodeArray;

import java.util.List;

public class count_pairs_whose_sum_is_less_than_target {

    public static void main(String[] args) {
    //nums =
        //[-1,1,2,3,1]
        System.out.println(countPairs(List.of(-1, 1, 2, 3, 1), 5));

    }

    public static int countPairs(List<Integer> nums, int target) {
        var count = 0;

        for(int i = 0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                if((nums.get(i) + nums.get(j) < target)){
                    count++;
                }
            }

        }
        return count;
    }
}
