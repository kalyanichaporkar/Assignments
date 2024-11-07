package sortingAlgos;

public class BubbleSort {
	public static int loopCount;
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		loopCount = 0;
		while(n > 1) {
			int left = 0;
			
			while(left < (n-1)) {
				++loopCount;
				if(arr[left + 1] < arr[left]) {
				int t = arr[left];
				arr[left] = arr[left+1];
				arr[left+1] = t;
				}
				++left;
			}
			if(loopCount == 0)
				return;
		}
		n = n-1;
	}
	
	public static void bubbleSortOptimised(int[] arr) {
		int n = arr.length;
		loopCount = 0;
		
		while(n>1) {
			int left = 0;
			int swapCount = 0;
			
			while(left < (n-1)) {
				++loopCount;
				
				if(arr[left + 1] < arr[left]) {
					int t = arr[left];
					arr[left] = arr[left + 1];
					arr[left + 1] = t;
					
					++swapCount;
				}
				++left;
			}
			if(swapCount == 0)
				break;
			}
		--n;
		}
	
}
