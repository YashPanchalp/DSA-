
public class left_rotate_by_d {

    public static int[] leftDPlaces(int arr[], int d){

        rev(0,d-1,arr);
        rev(d,arr.length-1,arr);
        rev(0,arr.length-1,arr);

        return arr;

    }    

    public static void rev(int start, int end , int arr[]){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};

        int ans[] = leftDPlaces(arr, 3);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }

}
