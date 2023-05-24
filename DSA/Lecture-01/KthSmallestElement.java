import java.util.*;

public class KthSmallestElement {

    public static int findKthSmallest(int[] nums, int k) {
        // Create a min-heap of the first k elements of the array.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }

        // Iterate over the remaining elements of the array.
        for (int i = k; i < nums.length; i++) {
            // If the current element is smaller than the smallest element in the min-heap,
            // remove the smallest element from the min-heap and add the current element.
            if (nums[i] < minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }

        // The smallest element in the min-heap is the kth smallest element in the array.
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 11, 13};
        int k = 3;
        int kthSmallest = findKthSmallest(nums, k);
        System.out.println("The kth smallest element is: " + kthSmallest);
    }
}
