
import java.util.*;

public class Question5 {

	public static int findMinRec(int A[], int n)
	{
	if(n == 1)
		return A[0];
		
		return Math.min(A[n-1], findMinRec(A, n-1));
	}

	public static void main(String args[])
	{
		int A[] = {1, 4, 45, 6, -50, 10, 2};
		int n = A.length;
		
		// Function calling
		System.out.println(findMinRec(A, n));
	}
}


