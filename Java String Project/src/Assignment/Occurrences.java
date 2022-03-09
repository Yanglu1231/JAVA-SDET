package Assignment;

import java.util.HashMap;

public class Occurrences {

	int [] integers;

	public int[] getIntegers() {
		return integers;
	}

	public void setIntegers(int[] integers) {
		this.integers = integers;
	}
	
	public HashMap<Integer, Integer> countNumber(int[] integers) {
		HashMap<Integer, Integer> occurence = new HashMap<Integer,Integer>();
		for(int i = 0; i<integers.length;i++) {
			if(occurence.get(integers[i]) != null) {
			occurence.put(integers[i], occurence.get(integers[i]) +1);
			}
			else
				occurence.put(integers[i], 1);
		}
	
		System.out.println(occurence);
		return occurence;
	}
	
}
