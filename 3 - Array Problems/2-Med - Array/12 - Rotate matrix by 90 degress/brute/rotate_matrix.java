public class rotate_matrix {

    public static int[][] rotate(int arr[][] , int n){
 
        int ans[][] = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                ans[j][(n-1)-i] = arr[i][j];
            }
        }
        return ans;
    }    
    
    public static void main(String[] args) {
        
        int matrix[][] = { {1 ,2 ,3},
                           {4 ,5 ,6},
                           {7 ,8 ,9}};
        
        int ans[][] = rotate(matrix, 3);
        
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(ans[i][j] + " ");
            }
                System.out.println("");
        }
    }
}
