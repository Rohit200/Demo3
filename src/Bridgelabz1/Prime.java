package Bridgelabz1;

import Bridgelaz.Util.*;

public class Prime
{
	public static void main(String[] args)
	{
	
System.out.println("Enter the number till you want ti find prime Numer");
 int n=Util.input();
for (int i=2;i<=n;i++)
    {
    	boolean rs=Util.prime(i);
    	if(rs)
    		System.out.println("Prime Number ---> "+i);
    }
	}

}
