package prime_nonPrime_Largest_Smallest_Missing_Number;

public class FindSmallestNumber {

	public static void main(String[] args) {
		//array of 10 numbers
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,
				56,78,90,54,32,123,67,5,679,54,32,65};
		
		//assign first element of an array to largest and smallest
		int smallest = array[0];
		
		for(int i=1; i< array.length; i++){
			if(array[i] < smallest)
				smallest = array[i];
		}
		System.out.println("Smallest Number is : " + smallest);
	}
}