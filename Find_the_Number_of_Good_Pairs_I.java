package LeetCodeArray;

public class Find_the_Number_of_Good_Pairs_I {


    public static void main(String[] args) {

        //Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
        System.out.println(numberOfPairs(new int[]{1,3,4}, new int[]{1,3,4}, 1));
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        var count = 0;
        for (int i =0; i< nums1.length ; i++){
            for (int j = 0; j < nums2.length ; j++){
                if( (nums2[j]*k) != 0 && nums1[i] % (nums2[j]*k) == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
