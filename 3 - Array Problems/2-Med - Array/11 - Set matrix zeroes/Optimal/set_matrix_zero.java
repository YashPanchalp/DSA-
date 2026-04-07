
public class set_matrix_zero {

    //n -> rows and m -> cols
    //set zero whole row and col if any of the ele zero
    public static int[][] setZeroes(int arr[][] , int m , int n){

        boolean first_row_zero = false;
        boolean first_col_zero = false;

        //s1 -> check any zeros in first row/col

        //row
        for(int j = 0 ; j < m ; j++){
            if(arr[0][j] == 0){
                first_row_zero = true;
                break;
            }
        }

        //col
        for(int i = 0 ; i < n ; i++){
            if(arr[i][0] == 0){
                first_col_zero = true;
                break;
            }
        }

        //s2 -> if any ele = 0 : correspondng row - col is also zero
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        //s3 -> if any first row / col = 0 then that ele = 0
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        //s4-> at last check first row / col if any zero entire zero
        if(first_row_zero){
            for(int j = 0 ; j < m ; j++){
                arr[0][j] = 0;
            }
        }
        if(first_col_zero){
            for(int i = 0 ; i < n ; i++){
                arr[i][0] = 0;
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = { {1 ,1 ,1 ,1},
                           {1 ,0 ,0 ,1},
                           {1 ,1 ,0 ,1},
                           {1 ,1 ,1 ,1}};
        
        int ans[][] = setZeroes(matrix, 4, 4);
        
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(ans[i][j] + " ");
            }
                System.out.println("");
        }
    }
}
