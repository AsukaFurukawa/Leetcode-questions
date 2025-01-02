import java.util.HashMap;

public class TwoSumOptimalHashMap {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If so, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            // If not, add the current element and its index to the map
            map.put(nums[i], i);
        }
         // If no solution is found, throw an exception
         throw new IllegalArgumentException("No two sum solution");
    }
    
        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;
    
            TwoSumOptimalHashMap solution = new TwoSumOptimalHashMap();
            int[] result = solution.twoSum(nums, target);
    
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
}
    
/*
Explanation:
1. **HashMap**: A HashMap is used to store each number in the array as a key and its index as the value.
2. **Iteration**:
   - As you iterate through the array, compute the complement of the current number (i.e., `target - nums[i]`).
   - Check if the complement already exists in the HashMap.
3. **Match Found**:
   - If the complement is found, it means the current number and the complement add up to the target.
   - The indices of the two numbers are returned as the solution.
4. **No Match Found**:
   - If the complement is not found, add the current number and its index to the HashMap and continue.
5. **Throw Exception**:
   - If the loop completes without finding a solution, an exception is thrown.

### Time Complexity:
- The loop iterates through the array once, and each lookup or insertion operation in a HashMap takes O(1) on average.
- Total: O(n).

### Space Complexity:
- The HashMap requires additional space to store up to n elements.
- Total: O(n).
*/
