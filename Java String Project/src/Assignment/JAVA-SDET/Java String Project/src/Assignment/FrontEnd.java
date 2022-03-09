package Assignment;

public class FrontEnd {

	public static void main(String[] args) {
		Vowels v = new Vowels();
		v.setSentence("I love you");
		v.CountVowels("I love you");
		v.CountVowels("I LOVE YOU");

		Palindrome p = new Palindrome();
		p.setPalind("IOI");
		p.IsPalind("IOI");
		p.IsPalind("AOOOOOA");
		
		Words w = new Words();
		w.TotalWords("I love you a lot");
		
		Consonants c = new Consonants();
		c.CountConsonants("I love you");
		
		LastLetterCount l = new LastLetterCount();
		l.CountSandY("This is used for any tool and technology.");
		
		RotateString r = new RotateString();
		r.leftrotate("Apple", 2);
		
		TraverseString t = new TraverseString();
		t.getUnique("racecar and you");
	}

}
