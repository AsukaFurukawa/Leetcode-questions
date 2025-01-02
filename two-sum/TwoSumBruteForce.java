import java.util.*;

//Brute force solution for Two Sum problem
public class TwoSumBruteForce {
    public static int[] twoSum(int[] nums, int target) {
        //Iterate through each element of the array
        for(int i = 0; i < nums.length; i++) {
            //for each element, iterate through the rest of the array
            for(int j = i + 1; j < nums.length; j++) {
                //Check if the sum of the nums[i] and nums[j] equals the target
                if(nums[i] + nums[j] == target) {
                    //if so, return the indices of the two numbers
                    return new int[] {i,j};
                }
            }
        }

        //if no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}



/*
Time Complexity Analysis:
The time complexity of this brute force approach is O(n^2), where n is the number of elements in the input array.
- The outer loop runs n times.
- The inner loop runs approximately (n-1), (n-2), ..., 1 times for each iteration of the outer loop.
- This results in a quadratic time complexity due to the nested loops.

Space Complexity:
The space complexity is O(1) because we are not using any additional data structures; only a fixed amount of extra space is used for variables.
*/