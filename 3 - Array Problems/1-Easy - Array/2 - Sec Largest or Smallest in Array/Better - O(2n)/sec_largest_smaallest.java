
public class sec_largest_smaallest {

    public static int find_sec_largest(int arr[]){

        int largest= arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int slargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static int find_sec_smallest(int arr[]){

        int smallest= arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        int ssmallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < ssmallest && arr[i] != smallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        
        int arr[] = { 1,2,3,4,6,7};
        System.out.println(find_sec_smallest(arr)+" "+find_sec_largest(arr));
    }
    
}
