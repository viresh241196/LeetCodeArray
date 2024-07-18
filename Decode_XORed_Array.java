package LeetCodeArray;

import java.util.Arrays;

public class Decode_XORed_Array {

    public static void main(String[] args) {
    //Input: encoded = [1,2,3], first = 1
        //Output: [1,0,2,1]
        //Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

        System.out.println(Arrays.toString(decode(new int[]{1,2,3}, 1)));
    }

    public static int[] decode(int[] encoded, int first) {
        var result = new int[encoded.length+1];
        result[0] = first;
        for(int i = 0;i<encoded.length; i++){
            result[i+1] = encoded[i] ^ result[i];
        }
        return result;
    }
}
