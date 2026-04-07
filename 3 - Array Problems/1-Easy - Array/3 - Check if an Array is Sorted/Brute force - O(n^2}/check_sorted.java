public class check_sorted{

    public static boolean issorted(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){

                if(arr[j]<arr[i]) return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,2};
        System.out.println(issorted(arr));
    }
}