public class maxLen_subArray_sum {

    public static int maxLen(int arr[] ,int k){

        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int max_len = 0;

        while(right < n){ //left boundary

            while(sum > k && left <= right){
                sum = sum - arr[left];
                left++;
            }

            if(sum == k) max_len = Math.max(max_len , (right-left)+1);

            right++;
            if(right < n) sum = sum + arr[right];
        }
        return max_len;
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 1, 2, 1, 1, 2};
        int k = 3;
        System.out.println(maxLen(arr, k));
    }
    
}