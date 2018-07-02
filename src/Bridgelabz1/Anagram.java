package Bridgelabz1;
import Bridgelaz.Util.*;
public class Anagram
{
public static void main(String[] args)
{
	System.out.println("Enter the first String");
	String s1= Util.inputString();
	System.out.println("Enter the second String");
	String s2= Util.inputString();
	boolean rs=Util.anagram(s1, s2);
	if(rs)
		System.out.println("Anagram");
	else
		System.out.println("Not Anagram");

	}

}
