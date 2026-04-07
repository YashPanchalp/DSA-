import java.util.ArrayList;
import java.util.List;

public class print_spiral_matrix {

    public static List<Integer> sprial(int arr[][] , int n , int m){

        List<Integer> ans = new ArrayList<>();

        int top = 0, bottom = n-1;
        int left = 0, right = m-1;

        while(left<=right && top<=bottom){

            //left -> right : top constant as row
            for(int i = left ; i <= right ; i++){
               ans.add(arr[top][i]);
            }
            //top++ : end
            top++;

            //top -> bottom : right constant as col
            for(int i = top ; i <= bottom ; i++){
                ans.add(arr[i][right]);
            }
            //right-- : end
            right--;

            //check top <= bottom : bec we done top++
            if(top <= bottom){
                //right -> left : bottom constant as row
                for(int i = right ; i >= left ; i--){
                    ans.add(arr[bottom][i]);
                }
                //bottom-- : end
                bottom--;
            }

            //we have done right-- so check if left <= right
            if(left <= right){
                 //bottom -> top : left constant as col
                for(int i = bottom ; i>= top ; i--){
                    ans.add(arr[i][left]);
                }
                //left++ : end
                left++;
            }        
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        List<Integer> ans = sprial(matrix, 3, 3);

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
    
}
