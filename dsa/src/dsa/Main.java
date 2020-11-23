package dsa;
import java.util.*;
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception
	{
             
		Scanner s = new Scanner(System.in);
		char c[] = s.nextLine().toCharArray();
		int freq[]=new int[256];
		for(char i:c)
		{
			if(i==' ')
				continue;
			freq[i-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			if(freq[i]>1)
			{
				System.out.print((char)(i+'a')+" "+freq[i]);
				System.out.println();
			}
		}
		
		
     
    }
	
	
	
}



