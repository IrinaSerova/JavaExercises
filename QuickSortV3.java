package com.irinaserova;

// Choose a pivot value. We take the value of the last element as pivot value,

//places all smaller (smaller than pivot) to left of
//pivot and all greater elements to right
//of pivot



class QuickSortV3 {

	static int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1); // index of smaller element
		for (int j=low; j<=high-1; j++)
		{
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot)
			{
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}


//	arr[] --> Array to be sorted,
//	low --> Starting index,
//	high --> Ending index 
	static void quickSort(int arr[], int low, int high){
		if (low < high){
		
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	

	public static void main(String args[]){
		
		int n = 5;
		int arr[] = {14, 23, 16, 9, 2};
		
		quickSort(arr, 0, n-1);
		
		for(int i =0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}