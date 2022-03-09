package Assignment;

public class TraverseString {

	String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public String getUnique(String sentence) {
		
		 String temp = "";
		 
         for (int i = 0; i < sentence.length(); i++){
            if (temp.indexOf(sentence.charAt(i)) == - 1){
               temp = temp + sentence.charAt(i);
         }
      }

         System.out.println(temp + " ");
         return temp;
		
	}
	
}
