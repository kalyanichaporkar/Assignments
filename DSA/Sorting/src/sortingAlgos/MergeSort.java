package sortingAlgos;

public class MergeSort {
	
//	public static void mergeSort(int arr[],int startpos1, int endpos1, int startpos2, int endpos2) {
//	if((endpos2 - startpos2 + 1) <= 1) {
//		int[] mergedArray = new int[endpos1 - startpos1];
//		int i1 = startpos1;
//		int i2 = startpos2;
//	}
	
	public static void mergeesort(int array[], int temp[], int startpos, int endpos) {
		if((endpos - startpos + 1)<=1) {
			return;
		}
		
		int midpos = startpos + (endpos - startpos)/2;
		mergeesort(array, temp, startpos, midpos);
		mergeesort(array, temp, midpos + 1, endpos);
		
		Merge(array, temp, startpos, midpos + 1, endpos);
		return;
	}
	
	public static void Merge(int array[], int temp[], int startpos, int midpos, int endpos) {
		
	}
	
}
