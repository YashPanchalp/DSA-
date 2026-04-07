
public class set_matrix_zero {

    //n -> rows and m -> cols
    //set zero whole row and col if any of the ele zero
    public static int[][] setZeroes(int arr[][] , int m , int n){

        int row[] = new int[n];
        int col[] = new int[m];

        //mark : 1 when any of ele = 0 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[i] = 1;
                }
            }
        }

        //where 1 : set ele zero
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
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
