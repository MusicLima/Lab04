	package lab.oodp.moreclass.pattern;
	
	public class Pattern01 
	{
	private int numberOfCharacters;
	private char character;
	
	public Pattern01(int n,char c) {
		numberOfCharacters=n;
		character=c;
		
	}
	public int getNumberOfCharacters() {
		return this.numberOfCharacters;
	}
	public void setNumberOfCharacters(int numberOfCharacters){
		this.numberOfCharacters=numberOfCharacters;
	}	
	public String toString() {
		String a ="";
		
		for(int i=0;i<numberOfCharacters;i++) {
			 a=a+character;
		}
		return a;
	}
	}
	
