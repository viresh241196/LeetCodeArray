package LeetCodeArray;

public class Number_of_employees_who_met_the_target {


    public static void main(String[] args) {
    //hours =
        //[0,1,2,3,4] target = 2

        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        var count = 0 ;
        for (int hour : hours) {
            if(hour >=target){
                count++;
            }
        }
        return count;
    }
}
