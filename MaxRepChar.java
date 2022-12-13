import java.util.*;
class MaxRepChar
{	
		public static void main(String[] args)
		{
			String a;
			Scanner s=new Scanner(System.in);
			System.out.println("ENTER YOUR STRING");
			a = s.nextLine();
			int[] arr=new int[127];
			
			for(int i=0;i<a.length();i++){
					arr[a.charAt(i)]=arr[a.charAt(i)]+1;
					}
					int max=-1;
					char c=0;
					for(int i=0;i<a.length();i++)
					{
					 if(max<arr[a.charAt(i)])
					 {
					   max=arr[a.charAt(i)];
					   c=a.charAt(i);
					  }
				}
					  
					System.out.println("MAXIMUM REPEATED CHARACTER IS:"+c);
    }
  }					
					
 
