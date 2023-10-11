package string_Demo;

public class String_name {

	public static void main(String[] args) {
		 
		String_name  object = new String_name();
		
		object . charat();
		object . Count();
		object . sentence();

	}
	
	public void charat()
	{
		String s = "Subramani";
		
		System.out.println(s.length());   //length find method 
		
		int i = 0;
		while(i<s.length())
		{
			System.out.println(s.charAt(i));   // Striing convert to single char
		    i++;
		}
			
			}
	
	public void Count()
	{
		String  s = "Subramai Perumal";
		
		int i = 0;
		int count = 1;
		
		while(i<s.length())
		{
			if(s.charAt(i)== ' ')
			count ++;
			i++;
				
			}
		System.out.println("No of count "+count);
		}
	
	
	public void sentence()
	{
		String s = "Subramani from Trichy.Subramani current living Velachery.";
		
		int i = 0;
		int count = 0;
		
		while(i<s.length())
		{
			if(s.charAt(i) == '.')
				 count ++;
		         i++;	
		}
		System.out.println("No of sentence "+count);
	}
	}
	
		
	


