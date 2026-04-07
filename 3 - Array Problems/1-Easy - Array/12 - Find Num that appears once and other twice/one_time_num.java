
public class one_time_num {

    public static int occurOnce(int arr[]){

        int xor = 0;

        for(int num : arr){
            xor = xor ^ num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = {4,4,1,2,2};

        System.out.println(occurOnce(arr));
    }
    
}
