package LeetCodeArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class kids_with_the_greatest_number_of_candies {

    public static void main(String[] args) {
        //candies = [2,3,5,1,3], extraCandies = 3
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies)
                .mapToObj(candy->candy+extraCandies >= max)
                .collect(Collectors.toList());
    }
}
