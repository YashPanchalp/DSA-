
public class print_maxSubArraySum {

    public static int[] maxSubArraysum(int arr[]){

        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int se = 0;
        int ee = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(cs == 0) se = i; //prev ele sum 

            cs = cs + arr[i];

            if(cs > ms){
                ms = cs;
                ee = i;
            }

            if(cs < 0) cs = 0; //if after adding it is -v then consider as zero
        }
        return new int[] {ms,se,ee};
    }

    public static void main(String[] args) {
        
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        int ans[] = maxSubArraysum(arr);

        System.out.println("The max sum  = " + ans[0] + " between idx " + ans[1] + " to " + ans[2]);

        for (int idx = ans[1]; idx <= ans[2]; idx++) {
            System.out.print(arr[idx]+ " ");
            
        }
    }
    
}
