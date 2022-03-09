package Assignment;


public class Palindrome {
	private String palind;

	public String getPalind() {
		return palind;
	}

	public void setPalind(String palind) {
		this.palind = palind;
	}
	
	public boolean IsPalind(String palind)
    {

        int i = 0, j = palind.length() - 1;
        
        while (i < j) {
            if (palind.charAt(i) != palind.charAt(j)) {
            	System.out.println("This word is not a palindrome");
                return false;
            }
            i++;
            j--;
        }
 
        System.out.println("This word is a palindrome");
        return true;
    }
}
