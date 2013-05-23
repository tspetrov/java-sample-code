package someAlgorithms;

//some of the algorithms that i know

public class Algorithms {

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++)
			for (int j = 1; j < array.length - i; j++) 
				if(array[j-1] > array[j])
				{
					int temp = array[j-1] ;
					array[j-1] = array[j] ;
					array[j] = temp ;
				}
			

	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
	}

	public static boolean binarySearch(int[] array, int value) {

		int left = 0, right = array.length - 1;
		int middle;
		while (right >= left) {
			middle = (right + left) / 2;
			if (value == array[middle])
				return true;
			if (value > array[middle]) {
				left = middle + 1;
			}
			if (value < array[middle]) {
				right = middle - 1;
			}
		}
		return false;

	}
}
