import java.util.*;
public class StringPalindrome {

 public static void main(String[] args) {
		 String rev=" ";
	 	  Scanner sc= new Scanner(System.in);  
		System.out.print("Enter a string : ");  
		String str= sc.nextLine();
		String[] strArray = str.split(" ");
		System.out.println("You have entered: "+str);
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+ str.charAt(i);
		}
		if(str.equals(rev))
		 {
			System.out.println(str + "is a palindrome");
		}
			else{
				System.out.println(str + "is  not a palindrome");
			}
	
  }
}