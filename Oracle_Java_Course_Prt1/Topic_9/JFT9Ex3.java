import java.util.ArrayList;

public class JFT9Ex3
{
	public static void main (String[] args)
	{
		ArrayList<String> big4 = new ArrayList<String>();
		
		big4.add("Chelsea");
		big4.add("Manchester City");
		big4.add("Arsenal");
		big4.add("Manchester Utd");
		
		int i = 0;
		
		while(i < big4.size())
		{
			System.out.println(big4.get(i));
			i++;
		}
		
		System.out.println("");
		System.out.println(big4.contains("Leeds Utd"));
		big4.remove("Manchester Utd");
		big4.add("Liverpool");
		System.out.println(big4.get(2));
		System.out.println(big4.indexOf("Liverpool"));
		System.out.println("");
		
		for(String s : big4)
		{
			System.out.println(s);
		}
		
	}
}