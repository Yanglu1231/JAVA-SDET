package Assignment;

public class LastLetterCount {
	private String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public int CountSandY(String sentence) {
		int count = 0;
		int s = 0;
		int y = 0;
        String temp[] = sentence.split(" ");
        String temp2[] = sentence.split(" ");
        String temp1[] = temp;
        
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].trim().endsWith("s")) {
                s = i;
            break;
            }
        }
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].trim().endsWith("y")) {
                y = i;
            break;
            }
        }
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].trim().endsWith("s") || temp[i].trim().endsWith("y"))
                count++;
        }
        
        temp1[y] = temp[s];
        temp1[s] = temp2[y];

        
        sentence = String.join(" ", temp1);
        
        System.out.println(sentence);
        
        System.out.println("count total is " + count);
        return count;
	}
	
}
