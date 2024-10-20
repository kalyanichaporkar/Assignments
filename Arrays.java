public class Arrays{
	public static void printArray(int [] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static int[] reSizeArray(int[] arr, int newSize) {
		int [] newArray = new int[newSize];
		
		for(int i=0; i<arr.length; i++) {
			newArray[i] = arr[i];
		}
		
		return newArray;
	}
	
	public static int insertInArray(int [] arr, int n, int pos, int value) {
		for(int i=n; i>pos; i++) {
			if(arr[i] == arr[i-1]) {
				arr[pos] = value;
			}
		}
		return n-1;
	}
}