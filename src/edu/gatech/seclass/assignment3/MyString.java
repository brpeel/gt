package edu.gatech.seclass.assignment3;


public class MyString implements MyStringInterface {

	private String str;
	
	public MyString() {
	}

	@Override
	public void setString(String str) {
		this.str = str;
	}

	@Override
	public String getString() {
		return this.str;
	}

	@Override
	public String getVowels() {
		
		if (str == null)
			return null;
		
		StringBuilder sb = new StringBuilder();
		
		char[] chars = this.str.toCharArray();
		
		for (char c : chars){
			//AEIOU
			if (c == 'A' || c == 'a' 
				|| c == 'E' || c == 'e'  
				|| c == 'I' || c == 'i' 
				|| c == 'O' || c == 'o' 
				|| c == 'U' || c == 'u')
				sb.append(c);
				
		}
		
		return sb.toString();
	}

	@Override
	public String getSubstring(int start, int end) {
		if (str == null)
			return null;
		return str.substring(start, end);
	}

	@Override
	public int indexOf(char c) {
		
		return (str != null ? str.indexOf(c) : -1); 
	}

	@Override
	public void removeChar(char c) {
		if (str != null)
			str = str.replaceAll(""+c, "");
	}

	@Override
	public void invert() {
		if (str != null)
		{
			StringBuilder sb =  new StringBuilder(str);
			str = sb.reverse().toString();
		}

	}

}
