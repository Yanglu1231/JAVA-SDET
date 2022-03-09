package Assignment;

public class RotateString {

	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public String leftrotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            System.out.println(ans);
	            return ans;
	    }

}
