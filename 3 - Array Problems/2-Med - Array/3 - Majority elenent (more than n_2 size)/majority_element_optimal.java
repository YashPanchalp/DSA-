
public class majority_element_optimal {

    public static int majorityEle(int arr[]){

        int count = 0;
        int ans = 0; 

        for(int i = 0 ; i < arr.length ; i++){

            if(count == 0){
                count=1;
                ans = arr[i];
            }
            else if(arr[i] == ans){
                count++;
            }
            else { //not match with ans 
                count--;
            }
        }

        int n_count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == ans) n_count++;
        }

        if(n_count > arr.length/2) return ans;

        return -1; //not exists

    }

    public static void main(String args[]){

        int arr[]= {0,1,1,2,1};

        System.out.println(majorityEle(arr));
    }

    
}
