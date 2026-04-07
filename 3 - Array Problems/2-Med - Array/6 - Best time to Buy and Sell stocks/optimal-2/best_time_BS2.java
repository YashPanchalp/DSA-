 //only buy if it is min
public class best_time_BS2 {

    public static int max_profit(int arr[]){

        int min = Integer.MAX_VALUE; //we have to compare if it less than min 
        int max_profit = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] < min){
                min = arr[i]; //only buy
            }
            else{
                max_profit = Math.max(max_profit , arr[i] - min ); //sell and check if give max profit
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        
        int arr[]= {7,1,5,3,6,4};

        System.out.println(max_profit(arr));
    }
    
}
