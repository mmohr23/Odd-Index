public class PrintOdd 
{
    public static void main(String[] args)
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    
    public static void printOddIndices(int[] arr)
    {
        // your code goes here!
        //for loop
        for(int i=0; i < arr.length; i++){
            //if index can be divided by 2 and get 0 remainder, print. 
            if(i % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}