
public class find_conse_ones {

    public static int consOnes(int arr[]){

        int count = 0;
        int max_count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                count++;
                max_count = Math.max(count,max_count);
            }
            else{
                count = 0;
            }
        }
        return max_count;
    }


    public static void main(String[] args) {
        
        int arr[]= {1,1,0,1,0,1};

        System.out.println(consOnes(arr));
    }
    
}
