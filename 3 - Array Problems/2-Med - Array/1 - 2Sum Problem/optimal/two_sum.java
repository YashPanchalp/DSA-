public class two_sum {

    public static int[] idxes(int arr[] , int target){

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            if(arr[left] + arr[right] == target) return new int[]{left,right};
            else if(arr[left] + arr[right] > target) right--;
            else left++;
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args){

        int arr[] = {2,5,6,8,11};
        
        int ans[] = idxes(arr,14);

        for(int i = 0 ; i < 2 ; i++){
            System.out.println(ans[i]);
        }
    }
}