public class left_rotate_byone {

    public static int[] left_rotate(int arr[]){

        int temp = arr[0];
        
        for(int i = 1 ; i < arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;

        return arr;
    }

    public static int[] right_rotate(int arr[]){

        int n = arr.length;

        // store last element
        int last = arr[n - 1];

        // shift elements to right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // place last element at first position
        arr[0] = last;

        return arr;
    }

    public static void print(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int arr1[] = {0,1,2,3,4};
        left_rotate(arr1);
        print(arr1);

        System.out.println("");

        int arr2[] = {0,1,2,3,4};
        right_rotate(arr2);
        print(arr2);

    }


    
}
