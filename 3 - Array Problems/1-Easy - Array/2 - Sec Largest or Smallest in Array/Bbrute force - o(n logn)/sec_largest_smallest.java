import java.util.*;
public class sec_largest_smallest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Second largest element
        int secondLargest = arr[n - 2];
        System.out.println("Second Largest: " + secondLargest);

        // Second smallest element
        int secondSmallest = arr[1];
        System.out.println("Second Smallest: " + secondSmallest);
    }
}