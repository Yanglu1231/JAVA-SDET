package Assignment;

public class Words {
	
	private String words;

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}
	
	public int TotalWords(String words) {
		int count = 0;
		for (int i = 0; i< words.length(); i++) {
			if(words.charAt(i) != ' ')
			count ++;
		}
		System.out.println("The total number of words =" + count);
		return count;
	}
	

}
