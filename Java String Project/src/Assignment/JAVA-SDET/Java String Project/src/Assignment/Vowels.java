package Assignment;

public class Vowels {
	private String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public int CountVowels(String sentence) {
		 int count = 0;
	        for (int i = 0; i < sentence.length(); i++)
	        {
	        	 if (sentence.toLowerCase().charAt(i) == 'a' || sentence.toLowerCase().charAt(i) == 'e' || sentence.toLowerCase().charAt(i) == 'i'
		                    || sentence.toLowerCase().charAt(i) == 'o' || sentence.toLowerCase().charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of  Vowels in the string: " + count);
	        return count;
	}
	
}
