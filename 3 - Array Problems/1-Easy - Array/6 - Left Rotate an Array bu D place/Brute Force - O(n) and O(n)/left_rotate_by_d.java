
public class left_rotate_by_d {

    public static int[] leftDPlaces(int arr[] , int d){

        int temp [] = new int[d];

        for(int i = 0 ; i <= d-1 ; i++){
            temp[i] = arr[i];
        }

        for(int i = d ; i < arr.length ; i++){
            arr[i-d] = arr[i];
        }

        for(int i = arr.length-d ; i < arr.length ; i++ ){
            arr[i] = temp[i-(arr.length-d)];
        }
    return arr;

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};

        int ans[] = leftDPlaces(arr, 2);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
