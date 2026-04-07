
import java.util.Arrays;

public class long_cons_seq {

    public static int longSeq(int arr[]){

        int count = 0;
        int lastEle = Integer.MIN_VALUE;
        int longSeq = 0; //default

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i]-1 == lastEle){ //if current-1 is last then inc. count
                count++;
                lastEle = arr[i];
            }
            else if(arr[i] != lastEle){ //new ele
                count = 1;
                lastEle = arr[i];
            }
            longSeq = Math.max(count,longSeq);
        }

        return longSeq;
    }

    public static void main(String[] args) {

        int arr[]= {102,4,100,1,101,3,2,0,1};

        System.out.println(longSeq(arr));
        
    }
    
}
