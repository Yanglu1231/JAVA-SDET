package Assignment;

public class Consonants {
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public int CountConsonants(String sentence) {
		 int count = 0;
	        for (int i = 0; i < sentence.length(); i++)
	        {
	        	 if (sentence.toLowerCase().charAt(i) == 'a' || sentence.toLowerCase().charAt(i) == 'e' || sentence.toLowerCase().charAt(i) == 'i'
		                    || sentence.toLowerCase().charAt(i) == 'o' || sentence.toLowerCase().charAt(i) == 'u' || sentence.toLowerCase().charAt(i) == ' ')
	            {
	               
	            }
	        	 else {
	        		 sentence = sentence.replace( sentence.charAt(i), '*');
	        		 count++;
	        	 }
	        }
	        
	        System.out.println("Number of  Consonants in the string: " + count);
	        System.out.println("This is the string after replacement: " + sentence);
	        return count;
	}
	
}
