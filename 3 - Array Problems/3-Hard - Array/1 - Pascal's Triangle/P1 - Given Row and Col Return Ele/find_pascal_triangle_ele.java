
public class find_pascal_triangle_ele {

    public static long ele(int row , int col){

        //it will return (n-1) C (r-1)
        int n = row - 1;
        int r = col - 1;
        
        long result = 1;

        //1 to r -> 0 to r-1
        for(int i = 0 ; i <= r-1 ; i++){
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        
        long ans = ele(5, 3);

        System.err.println(ans);
    }
    
}
