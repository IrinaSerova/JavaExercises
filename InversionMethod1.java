package com.irinaserova;

// Time Complexity: O(n^2)
	public class InversionMethod1 {
		 static int arr[] = new int[]{100, 15, 16, 40, 51};
		     // iterate over the array element by element and for each element we check the number of smaller element to the right of select element  
		    static int countInversions(int n) {
		        // Complete this function
		        int invCount = 0;
		        // if array is sorted inversion count = 0, if reversed - inversion - maximum
		        for (int i = 0; i < n - 1; i++) // n - total number of elements
		        for (int j = i+1; j < n; j++) // form element to its' right to element at index n-1
		          if (arr[i] > arr[j]) // encounter any element which is smaller than given element, increment the inversion count
		            invCount++;
		      
		      return invCount;
		        
		    }

		    public static void main(String[] args) {
		            long result = countInversions(arr.length);
		            System.out.println(result);
		        }
		   
		}