/*
 * Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples
Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input:
 [1]
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 */


// import java.util.Arrays;

public class Problem3 {
//* Brute A-1 - O[nlogn] - O[1] */
//     static private void getElements(int[] arr, int n)
// {
// 	if (n == 0 || n==1)
// 	{
// 		System.out.print(-1);
// 		System.out.print(" ");
// 		System.out.print(-1);
// 		System.out.print("\n");
// 	}
// 	Arrays.sort(arr);
// 	int small = arr[1];
// 	int large = arr[n - 2];
// 	System.out.println("Second smallest is "+small);
// 	System.out.println("Second largest is "+large);
// }

//* Better A-2 - O[n] - O[1] */

// static private void getElements(int[] arr, int n)
// {
// 	if (n == 0 || n==1)
// 	{
// 		System.out.print(-1);
// 		System.out.print(" ");
// 		System.out.print(-1);
// 		System.out.print("\n");
// 	}
// 	int small = Integer.MAX_VALUE;
// 	int second_small = Integer.MAX_VALUE;
// 	int large = Integer.MIN_VALUE;
// 	int second_large = Integer.MIN_VALUE;
// 	int i;
// 	for (i = 0;i < n;i++)
// 	{
// 		small = Math.min(small,arr[i]);
// 		large = Math.max(large,arr[i]);
// 	}
// 	for (i = 0;i < n;i++)
// 	{
// 		if (arr[i] < second_small && arr[i] != small)
// 		{
// 			second_small = arr[i];
// 		}
// 		if (arr[i] > second_large && arr[i] != large)
// 		{
// 			second_large = arr[i];
// 		}
// 	}

//* Optimal* A-3 - O[n] - O[1] single taversal*/
static private void getElements(int[] arr, int n)
{
	if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	int small = Integer.MAX_VALUE;
	int large = Integer.MIN_VALUE;
	int second_large = -1, second_small =-1 ;
	int i;

	for (i = 0;i < n;i++)
	{
		if (arr[i] < small)
		{
			second_small = small;
            small=arr[i];
		}else if(arr[i]<second_small && arr[i]!=small){
            second_small = arr[i];
        }

		if (arr[i] > large)
		{
			second_large = large;
            large=arr[i];
		}else if(arr[i]>second_large && arr[i]!=large){
            second_large=arr[i];
        }
	}

	System.out.println("Second smallest is "+second_small);
	System.out.println("Second largest is "+second_large);
}

public static void main(String[] args)
{
	int[] arr = {0,1, 2, 4, 61, 71, 5};
	int n = arr.length;
	getElements(arr, n);
}
}
