
import java.util.*;

//all on rightb are smaller

public class leaders_in_array {

    //keep track of max value right to every ele
    public static List<Integer> findLeaders(int arr[]){

        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = arr.length-1 ; i >= 0 ; i--){

            if(arr[i] > max){
                ans.add(arr[i]);
            }
            max = Math.max(arr[i],max);
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] ={10,22,12,3,0,6};

        List<Integer> ans = findLeaders(arr);
        Collections.reverse(ans);

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
    
}
