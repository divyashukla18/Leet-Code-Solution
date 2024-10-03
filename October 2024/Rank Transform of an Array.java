import java.util.Arrays;
import java.util.HashMap;
// Java (With Explanation)
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Edge case: If the array is empty, return an empty array
        if (arr.length == 0) return new int[0];
        
        // Step 1: Copy the original array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // Step 2: Create a HashMap to store the rank of each element
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1; // Rank starts from 1
        
        // Step 3: Assign ranks to the elements in the sorted array
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }
        
        // Step 4: Replace each element in the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}

