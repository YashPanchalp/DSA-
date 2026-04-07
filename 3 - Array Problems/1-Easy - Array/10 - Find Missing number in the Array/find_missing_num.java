
public class find_missing_num {

    public static int findNum(int arr[]){

        int n = arr.length;
        int es = n * (n + 1) / 2; //sum of all until length
        int cs = 0;

        for(int i = 0 ; i < arr.length ; i++){
            cs += arr[i];
        }
        return es - cs;
    }

    public static void main(String[] args) {

        int arr[] = {0,1,2,4,5}; //range : 0 to 5

        System.out.println(findNum(arr));
        

    }
    
}
