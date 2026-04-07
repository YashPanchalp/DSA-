public class rotate_matrix {

    public static int[][] rotate(int arr[][] , int n){
 
        //tanspose of matrix then rev

        //1- transpse on right of diagonal

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){

                //swap a[i][j] with a[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //rev each row
        for(int i = 0 ; i < n ; i++){

            int l = 0;
            int r = n-1;

            while(l < r){
                //swap that ele
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;

                l++;
                r--;
            }
        }
        return arr;
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
