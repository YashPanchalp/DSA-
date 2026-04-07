// + - + - + - : form
public class rearrange_by_sign {

    public static int[] rearrangeBySign(int arr[]){

        int ans[] = new int[arr.length];

        int pos = 0; //track pos and neg
        int neg = 1;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > 0){
                ans[pos] = arr[i];
                pos += 2;
            }
            else{
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] = {3,1,-2,-5,2,-4};

        int ans[] = rearrangeBySign(arr);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
