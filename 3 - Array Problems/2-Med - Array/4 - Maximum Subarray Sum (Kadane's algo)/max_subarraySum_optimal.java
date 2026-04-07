
public class max_subarraySum_optimal {

    public static int maxSubArraysum(int arr[]){

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            cs = cs + arr[i];

            ms = Math.max(cs,ms);

            if(cs < 0) cs = 0; //if after adding it is -v then consider as zero
        }
        return ms;
    }

    public static void main(String[] args) {
        
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.err.println(maxSubArraysum(arr));
    }
    
}
