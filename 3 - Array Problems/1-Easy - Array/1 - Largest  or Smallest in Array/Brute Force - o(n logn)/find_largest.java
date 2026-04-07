import java.util.Arrays;


public class find_largest{

    public static int[] largest(int arr[]){

        Arrays.sort(arr);

        int ans[] = new int[2]; //returns array with sec smallest and largest
        ans[0] = arr[0];             // sec_smallest as the first ele
        ans[1] = arr[arr.length-1];  // sec_largest as the last ele
        return ans;

    }
    public static void main(String[] args) {

        int arr[] = { 1,2,6,8,9,4};
        int ans[] = largest(arr);
        System.out.println("Smallest="+ans[0] + " " +" Largest="+ ans[1]);
        
    }
}