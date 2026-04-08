
public class pascal_triangle_nth_row {

    public static void print_row(int n){

        long ans = 1;

        //first ele always 1
        System.err.print(ans);

        //start with (n-i)/i
        for(int i = 1 ; i <= n-1 ; i++){
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(" " + ans);
        }
    }

    public static void main(String[] args) {
        
        print_row(6);
    }
    
}
