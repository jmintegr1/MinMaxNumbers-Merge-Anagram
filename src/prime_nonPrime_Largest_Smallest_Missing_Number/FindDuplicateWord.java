package prime_nonPrime_Largest_Smallest_Missing_Number;

import java.util.*;

public class FindDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Java is a programming Language, Java is  computer  a Language. Java is  widely used Language"; 
		Set<String> duplicates = duplicateWords(test); 
		System.out.println("input : " + test); 
		System.out.println("output : " + duplicates); }
	
	public static Set<String> duplicateWords(String input){ 
		if(input == null || input.isEmpty()){ 
			return Collections.emptySet(); } 
		Set<String> duplicates = new HashSet<>(); 
		String[] words = input.split("\\s+"); 
		Set<String> set = new HashSet<>(); 
		for(String word : words){ 
			if(!set.add(word)){ 
				duplicates.add(word); } } 
		return duplicates; 
		}

}