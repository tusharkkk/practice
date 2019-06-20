package tus;

public class UpperCaseString {
	

		
		public static void main(String[] args) 
		{ 
			
			StringBuffer str=new StringBuffer ("tushar");
			
			
			int ln = str.length(); 
				
			for (int i=0; i<ln; i++) 
			{ 
				Character c = str.charAt(i); 
				if (Character.isLowerCase(c)) 
					str.replace(i, i+1, Character.toUpperCase(c)+""); 
				else
					str.replace(i, i+1, Character.toLowerCase(c)+""); 
				
			} 
			System.out.println(str); 
			} 
	} 
	