import java.util.*;

public class FindTripletsWithZeroSum {

    public static List<List<Integer>> findTriplets(int[] nums) {
        // Sort the array.
        Arrays.sort(nums);

        // Create a list to store the triplets.
        List<List<Integer>> triplets = new ArrayList<>();

        // Iterate over all the elements in the array.
        for (int i = 0; i < nums.length - 2; i++) {
            // Find the other two elements that sum to -nums[i].
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    // Add the triplet to the list.
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        // Return the list of triplets.
        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        List<List<Integer>> triplets = findTriplets(nums);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
