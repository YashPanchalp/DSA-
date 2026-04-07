
public class sec_largest_smallest {

    public static int find_sec_largest(int arr[]){

        int largest=arr[0];
        int slargest=Integer.MIN_VALUE; //-1 if non negative array

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                slargest = largest; //assign prev value of the largest to the s;argest
                largest = arr[i];  //store largest as the curr max value
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i]; //if > than slargest but < largest 
            }
        }
        System.out.println("Sec Laregest = "+ slargest + "\nLargest =" + largest);
        return slargest;
    }

    public static int find_sec_smallest(int arr[]){

        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE; 

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                ssmallest= smallest; //assign prev value of the smallest to the s;smallest
                smallest = arr[i];  //store smallest as the curr min value
            }
            else if(arr[i] > smallest && arr[i] < ssmallest){
                ssmallest = arr[i]; //if > than smallest but < ssmallest 
            }
        }
        System.out.println("Smallest = "+ smallest + "\nSecond Smallest =" + ssmallest);
        return ssmallest;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
        find_sec_smallest(arr);
        find_sec_largest(arr);
    } 
}
