
public class find_largest_smallest {

    public static int find_largest(int arr[]){

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static int find_smallest(int arr[]){

        int min = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        
        int arr[] = { 0,1,2,3,4,5};
        int max = find_largest(arr);
        int min = find_smallest(arr);
        System.out.println(min+" "+max);
    }
    
}
