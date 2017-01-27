public class Solution
{
    public int[] countingSort(int inputArray[])
    {
        int countingArray[] = new int[256];
        int outputArray[] = new int[256];
        for(int i=0; i < 7; i++)
            countingArray[inputArray[i]]++;
        for(int i=1; i <= 7; i++)
            countingArray[i]+=countingArray[i-1];
        for(int i=0; i <= 7; i++)
        {
            outputArray[countingArray[inputArray[i]]]=inputArray[i];
            countingArray[inputArray[i]]--;
        }
        return outputArray;
        
        
    }
    public static void main (String args[])
    {
        Solution obj = new Solution();
        int inputArray[] = {1,4,1,2,7,5,2};
        obj.countingSort(inputArray);
        
        
        
        
    }
}