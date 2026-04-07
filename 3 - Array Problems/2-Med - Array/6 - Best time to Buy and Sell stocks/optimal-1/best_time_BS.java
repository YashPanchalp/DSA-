
public class best_time_BS {

    public static int buyAnsSellPrice(int arr[]){

        int min = arr[0]; //buy at min
        int max_profit = 0; //get max profit

        for(int i = 0 ; i < arr.length ; i++){

            int current_profit = arr[i] - min;

            max_profit = Math.max(max_profit,current_profit);

            min = Math.min(min , arr[i]); //every time check if min and buy
        }
        return max_profit;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};

        System.out.println(buyAnsSellPrice(arr));
    }
}
