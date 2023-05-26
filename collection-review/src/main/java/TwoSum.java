import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2,7,3,15,12};
        System.out.println(Arrays.toString(twoSum1(array,9)));

        System.out.println("Optimal solution......");

        System.out.println(Arrays.toString(twoSum2(array,9)));
    }
    public static int[] twoSum1(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target) return new int[]{i,j};

            }
        }
        return new int[]{};
    }
//n*n operation: is possible to solve it in one pass

    //my optimal solution
    public static int[] twoSum2(int[] array, int target){
        //Create HashMap
        Map<Integer, Integer> map = new HashMap<>();
        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map
        for (int i=0; i < array.length; i++){
            int potentialMatch = target - array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);
        }

        return new int[]{};
    }

}
/*
Problem: Two Sum
• Given an array of integers nums and an integer target, return indices of the two numbers such that they
add up to target.
• You may assume that each input would have exactly one solution, and you may not use
the same element twice.
• You can return the answer in any order.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */