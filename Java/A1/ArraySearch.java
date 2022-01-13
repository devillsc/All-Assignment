

public class ArraySearch {
	
	public static void main(String[] args) {
		
		
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int n = 19;
		
	
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] == n)
			{
				System.out.println(n + " is on " + i + "th index.");
			}
		}
	}
}