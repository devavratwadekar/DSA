public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxSoFar;

            // If the current element is negative, swap maxSoFar and minSoFar.
            if (nums[i] < 0) {
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar.
            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            minSoFar = Math.min(nums[i], minSoFar * nums[i]);

            // Update maxProduct.
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        // int[] nums = {2, 3, -2, 4};
        int[] nums = {1,-2,7};
        System.out.println(maxProduct(nums)); // Output: 6
    }
}
