import java.util.Random;
class BubbleSorting2 {
    
    public static void main( String args[] ) {
		
	    int len=5;
	    int[] arrayCount = CreateArrayRandom(len);
        System.out.println("Random list of elements:");
		printArray(arrayCount);
		bubbleSort(arrayCount,len);
		System.out.println("Sorted list of elements:");
        printArray(arrayCount);
	}
	public static int[] CreateArrayRandom(int arrayLength)
		{
        Random arrayRomdom = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = arrayRomdom.nextInt(99);
        }
        return array;
        }
	
	public static void bubbleSort(int [] arr, int len)
	    {
        
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(arr[j+1]<arr[j]){

                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
        }
    
    private static void printArray(int[] array) 
	{
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
  
}