/**
 * Created by Wie Hsing Li on 12/22/2016.
 */
public class Quicksort {
    public static void quickSort(int[] array, int left, int right){

        if(left >= right) return;
		/*
		 * Need to pick pivot for sorting first
		 * Usually in the middle.
		 */
        int pivot = array[(left + right) / 2 ];
		/*
		 * Partition array around the pivot
		 * returns partition points (dividing point between left and right)
		 *
		 */
        int index = partition(array, left, right, pivot);
		/*
		 * Sort left and right. Called Recursively
		 *
		 */
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot){

		/*
		 * Start moving left and right towards each other
		 */
        while(left <= right){

			/*
			 * if the array element left of pivot is less than pivot
			 * advance left to right
			 */
            while(array[left] < pivot){
                left++;
            }
			/*
			 * Same thing on right side.
			 * If right is greater than pivot, advance right to left
			 */
            while(array[right] > pivot){
                right--;
            }
			/*
			 * If left is less than or equal to right
			 * then swap those elements
			 */
            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
		/*
		 * After elements are swapped correctly
		 * (left is less than pivot, right is greater than pivot)
		 * Need to return partition point (return divided point between left and right)
		 * That is going to be left
		 */
        return left;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
