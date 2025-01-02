// Two Sum Solution Using Binary Search
import java.util.Arrays;

public class TwoSumBinarySearch {
    public static int[] twoSum(int[] nums, int target) {
        // Create a copy of the original array to sort it without losing indices
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        // Iterate through each element and use binary search for the complement
        for (int i = 0; i < sortedNums.length; i++) {
            int complement = target - sortedNums[i];
            int index = Arrays.binarySearch(sortedNums, i + 1, sortedNums.length, complement);

            if (index >= 0) {
                // Find the original indices of the elements
                int index1 = -1, index2 = -1;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == sortedNums[i] && index1 == -1) {
                        index1 = j;
                    } else if (nums[j] == sortedNums[index] && j != index1) {
                        index2 = j;
                        break;
                    }
                }
                return new int[] { index1, index2 };
            }
        }
        // If no solution is found, throw an exception
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
Explanation:
1. **Sorting**: The input array is sorted to enable binary search.
2. **Binary Search**: For each element, the complement (target - current element) is searched in the sorted array using binary search.
3. **Original Indices**: Since sorting changes the order, the original indices of the two numbers are retrieved by iterating over the original array.
4. **Return**: Once the pair is found, their original indices are returned.

Time Complexity:
- Sorting the array: O(n log n)
- Binary search for each element: O(n log n) (as binary search runs in O(log n) and we iterate through n elements)
- Retrieving original indices: O(n)
- Total: O(n log n) due to sorting dominating the other operations.

Space Complexity:
- O(n) for storing the sorted copy of the array.
*/
