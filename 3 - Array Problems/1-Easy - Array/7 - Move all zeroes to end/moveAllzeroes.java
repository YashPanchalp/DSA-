
public class moveAllzeroes {

    public static int[] moveZeroesToEnd(int arr[]){

        //two pointer i and j -> i track zeroes and j to swap

        int left = -1;

        //set at first 0
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                left = i;
                break;
            }
        }

        //then start right from left+1 -> if left != 0 swap and i++
        for(int right = left + 1 ; right < arr.length ; right++){

            if(arr[right] != 0){

                //swap left and right ele
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        } 
        return arr;     
    }

    public static void main(String[] args) {
        
        int arr[] = {0,1,0,3,10,12};

        int ans[] = moveZeroesToEnd(arr);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print( ans[i] +" ");
        }
    }
    
}
