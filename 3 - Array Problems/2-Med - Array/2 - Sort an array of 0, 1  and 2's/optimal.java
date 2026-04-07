
import java.util.Arrays;

public class optimal {

    public static int[] sortColors(int arr[] ){
        int left = 0;
        int mid = 0;
        int right = arr.length-1;

        while(mid <= right){ //untill all are sorted

            if(arr[mid] == 0){
                swap(arr, mid, left);
                left++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, right);
                right--;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String args[]){

        int arr[] = {1,0,2,1,1,0};

        int ans[] = sortColors(arr);
        System.out.println(Arrays.toString(ans));

    }
    
}
