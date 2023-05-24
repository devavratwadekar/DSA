import java.util.*;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        // Create a max heap.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add all the elements of the array to the max heap.
        for (int num : nums) {
            maxHeap.add(num);
        }

        // Remove the first k elements from the max heap.
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        // The top element of the max heap is the kth largest element in the array.
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int k = 3;
        int kthLargestElement = findKthLargest(nums, k);
        System.out.println("The kth largest element in the array is " + kthLargestElement);
    }
}
