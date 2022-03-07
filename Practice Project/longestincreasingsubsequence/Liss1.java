package longestincreasingsubsequence;

public class Liss1 {
	
	static int max_ref; // storing  the largest increasing subsequence here

	static int findList(int array[], int number)
	{

		if (number == 1)
			return 1;
		int res, max_ending = 1;
		for (int index = 1; index < number; index++)
		{
			res = findList(array, index);
			if (array[index - 1] < array[number - 1]
				&& res + 1 > max_ending)
				max_ending = res + 1;
		}
		if (max_ref < max_ending)
			max_ref = max_ending;
		return max_ending;
	}
	static int lis(int arr[], int n)
	{
		max_ref = 1;
		findList(arr, n);
		return max_ref;
	}
	public static void main(String args[])
	{
		int a[] = { 8, 51, 47, 36, 75, 50, 41, 60 ,92 ,80, 89, 18, 101, 213};
		int n = a.length;
		System.out.println("Length of lis is " + lis(a, n) + "\n");
	}

}
