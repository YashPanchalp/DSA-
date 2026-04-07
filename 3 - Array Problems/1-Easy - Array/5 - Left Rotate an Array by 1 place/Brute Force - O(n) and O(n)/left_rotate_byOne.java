
public class left_rotate_byOne {

    public static int[] left_rotate(int arr[]){

        int ans[] = new int[arr.length];
        for(int i= 1; i < arr.length ; i++){
            ans[i-1] = arr[i];
        }
        ans[arr.length-1] = arr[0];

        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] = { 0,1,2,3,4,5};
        int ans [] = left_rotate(arr);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
