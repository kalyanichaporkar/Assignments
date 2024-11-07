package arraysOperations;

public class ArrayOperationsss {
	public static int insertElement(int[] arr, int n, int pos, int value) {
		
		for(int i=n; i>pos; --i) {
			arr[i] = arr[i-1];
		}
		arr[pos] = value;
		return n+1;
	}

	public static void main(String[] args) {
		int[] size = new int[3];
		int count = 0;
		size[0] = 4;
		++count;
		size[1] = 5;
		++count;
		
		
		count = insertElement(size, count, 1, 12);
	
		System.out.println(size);
	}
}
