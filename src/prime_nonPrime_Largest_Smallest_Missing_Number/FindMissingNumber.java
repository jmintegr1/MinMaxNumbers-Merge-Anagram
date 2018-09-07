package prime_nonPrime_Largest_Smallest_Missing_Number;

public class FindMissingNumber {
	public static void main(String args[]){
        int a[] = {10, 2, 9, 4, 5, 3, 1, 8, 6};
        int miss = getMissingNo(a,9);
        System.out.println(miss);   
    }
	    // Function to ind missing number
	    static int getMissingNo (int a[], int n) {
	        int i, total;
	        total  = (n+1)*(n+2)/2;   
	        for ( i = 0; i< n; i++)
	           total -= a[i];
	        return total;
	    }
	}

	