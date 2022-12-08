import java.util.*;
import java.util.Scanner;
public class CountNumberOfWords{
 public static void main(String[] args) {
 
  method1();
  method2();
  method3();
 }

 public static void method1() {
	
	  Scanner sc= new Scanner(System.in);  
		System.out.print("Enter a string by method1: ");  
		String str= sc.nextLine();
		String[] strArray = str.split(" ");
		System.out.println("You have entered: "+str);
		System.out.println("Number of words in a string = " + strArray.length);
 }

 public static void method2() {
  
    Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a string by method2: ");  
	String str1= sc.nextLine();
	System.out.println("You have entered: "+str1);
	int count = 0;
    for (String word : str1.split(" ")) {
    count++;
  }
  System.out.println("Number of words in a string = " + count);
 }

 public static void method3() {
     Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a string by method3: ");  
	String str2= sc.nextLine();
	System.out.println("You have entered: "+str2);
     int count = 1;
    for (int i = 0; i < str2.length() - 1; i++) {
    if ((str2.charAt(i) == ' ') && (str2.charAt(i + 1) != ' ')) {
    count++;

   }
  }
  System.out.println("Number of words in a string = " + count);
 }
}