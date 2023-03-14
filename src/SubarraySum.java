
public class SubarraySum {
	// Java program to implement
	// the above approach
	/*Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number. 
	 * Simple Approach: A simple solution is to consider all subarrays one by one and check the sum of every subarray. Following program implements the simple solution. Run two loops: the outer loop picks a starting point I and the inner loop tries all subarrays starting from i.
Algorithm:  

	1.Traverse the array from start to end.
	2.From every index start another loop from i to the end of array to get all subarray starting from i, keep a variable sum to calculate the sum.
	3.For every index in inner loop update sum = sum + array[j]
	ㄋ4.If the sum is equal to the given sum then print the subarray.
	 * */
	public static void main(String[] args)
    {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        int curr_sum, i, j;
        // Pick a starting point
        for (i = 0; i < n; i++) 
        {
            curr_sum = arr[i];
  
            // Try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) 
            {
                if (curr_sum == sum) 
                {
                    int p = j - 1;
                    System.out.println(
                     "Sum found between indexes " + 
                      i + " and " + p);
                    	
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
        System.out.println("No subarray found");
    }
}
