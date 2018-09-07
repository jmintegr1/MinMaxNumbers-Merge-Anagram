package prime_nonPrime_Largest_Smallest_Missing_Number;
public class Anagram {

	public static void main(String[] args)  {
	    String s1= "DOG"; 
	    String s2= "GOD";  
	    int lettersS1[] = new int[Character.MAX_VALUE];
	    int lettersS2[] = new int[Character.MAX_VALUE];
	    if(s1.length()!=s2.length())
	       System.out.print("No");
	    else {
	       for(int i = 0; i<s1.length() ;++i) {
	           lettersS1[s1.toLowerCase().charAt(i)]++;
	           lettersS2[s2.toLowerCase().charAt(i)]++;
	       }
	       boolean anag = true;
	       for(int i = 0;i<lettersS1.length&&anag;++i) {
	           if(lettersS1[i] != lettersS2[i]) {
	               anag = false;
	           }
	       }
	       if(anag) {
	           System.out.print("Anagram");
	       } else {
	           System.out.print("No anagram");
	       }
	    } 
	}
}