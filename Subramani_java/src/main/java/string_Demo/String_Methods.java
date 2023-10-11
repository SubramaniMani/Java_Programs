package string_Demo;

public class String_Methods {

	public static void main(String[] args) {
		
		String_Methods object = new String_Methods();
		
		//object.Contain();
		//object.Trim();
		object.compareto();
		//object.replace();
		
		

	}
	public void Contain()
	{
		String s = "Subramani Perumal Logambal";
		
		System.out.println(s.contains("P"));
	}
	
	
	public void Trim()
	{
		String s = "   Subramani Mani         ";
		
		System.out.println(s);
		
		System.out.println(s.trim());
		
	}
	
	public void compareto()
	{
		String name1 = "Subramani";
		String name2 = "Suvetha";
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.equals(name2));
		
		int index  = name1.indexOf("a");
		System.out.println(index);
		
		int index1 = name1.lastIndexOf("i");
		System.out.println(index1);
	}
	
	public void replace()
	{
		String name = "Subramani";
		
		System.out.println(name.replaceAll("a" , "A"));
		System.out.println(name.replaceFirst("S","M"));
	}

}
