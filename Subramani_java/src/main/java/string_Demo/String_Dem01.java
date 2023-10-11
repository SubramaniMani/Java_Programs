package string_Demo;
import java.util.Scanner;

public class String_Dem01 {

	public static void main(String[] args) {
		
		String_Dem01 object = new String_Dem01();
		
		//object.space();
		//object.space1();
		//object.space2();
	object.reverse();
		//object.reverse1();
		
		
		
	}
	private void reverse1() 
	{
		String name = "Subramani Goog Morning";
        name = name + " ";
		
		String name1 = "";
		
		String reverse ="";
		
		
		int letter =0;
		while(true)
		{
			try 
			{
				name.charAt(letter);
				letter++;
			}
			catch(Exception EX)
			{
				break;
			}
		}
		System.out.println(letter);
		
		
		
		for(int i=0; i<letter; i++)
		{
			if(name.charAt(i)!= ' ')
			{
				name1 = name1 + name.charAt(i);
			}
			else
			{
				reverse = name1 + " " + reverse;
				
				name1 = "";
			}
			
		}
		System.out.println(reverse);
		System.out.println("i");
	}

		
	
	private void reverse() 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Sentence");
		String word = sc.nextLine();
		word = word+" ";
		String word1 = "";
		String Reverse ="";
		int size = 0;
		
		while(true)
		{
			try
			{
				word.charAt(size);
				size++;
			}
			catch(Exception Ex)
			{
				break;
			}
		}
		
		for(int i=0; i<size; i++)
		{
			if(word.charAt(i)!=' ')
			{
				
				word1 = word1 + word.charAt(i);
			}
			else
			{
				Reverse = word1 +" "+ Reverse;
				
				word1 ="";
			}
		}
		System.out.println(Reverse);
		
		String  ch = "";
		
	    String tarket = "Subramani";
		
		int count = 0;
		
		for(int i=0 ; i<Reverse.length(); i++)
		{
			//if(tarket == Reverse.charAt(i))
			{
				ch =ch+Reverse.charAt(i);
				count ++;
			}
		}
		System.out.println(ch);
		System.out.println(count);
		 
		
		
	
		
	}
	private void space2() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String name = sc.nextLine();
		String name2 = "";
		int letter = 0;
		while(true)
		{
			try {
				name.charAt(letter);
				letter++;
			}
			catch(Exception EX)
			{
				break;
			}
		}
		for(int i=0; i<letter; i++)
		{
			/*
			 * if(name.charAt(i+1)==' ') { name2 = name2 + name.charAt(i); } else {
			 */
				if(name.charAt(i)!=' ')
				{
					name2 = name2+name.charAt(i);
				}
				else
				{
					if(name.charAt(i+1)==' ')
					{
						continue;
					}
					else
					{
					 name2 = name2 +name.charAt(i);
					}
				}
			
		}
		System.out.println(name2);
		
		
	}
	public void space()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		String name2 ="";
		
		for (int i = 0; i < name.length(); i++) 
			
		{
			if(name.charAt(i)!=' ')
			{
				name2 = name2+name.charAt(i);
				}
			//System.out.print(name.charAt(i));
		
			else
			{
				if(name.charAt(i+1)==' ')
				{
					continue;

				}
				else
				{
					name2=name2+name.charAt(i);				}
			}
		}
		System.out.println(name2);
		
		

	}
	
	private void space1() 
	{
		
		  Scanner sc = new Scanner(System.in); 
		  String name = sc.nextLine();
		  String name2 = "";
		  
		  int letters = 0;
		  while(true)
		  {
			  try 
			  {
			  name.charAt(letters);
			  letters ++;
		  }
			  catch(Exception Ex)
			  {
				  break;
			  }
		  }
		
		for(int i=0; i<letters; i++)
		{
			if(name.charAt(i)!=' ')
			{
				name2 = name2+name.charAt(i);
			}
			else
			{
				if(name.charAt(i+1)==' ')
				{
					continue;
				}
				else
				{
					name2 = name2+name.charAt(i);
				}
		}
		
		}
		System.out.print(name2);
	}
	}


