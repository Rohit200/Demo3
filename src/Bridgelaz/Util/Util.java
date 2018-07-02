package Bridgelaz.Util;
import java.util.Scanner;
import java.util.*;
public class Util
{
//private static final String String = null;
public static int input()
{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
      return n;
}
public static double inputDouble()
{
	 Scanner sc=new Scanner(System.in);
	 double n=sc.nextDouble();
     return n;
}
public static String inputString()
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	return s1;
}
public static boolean prime(int n)
{
			int i;
			for( i=2;i<=n/2;i++)
			{
				if(n%i!=0)
					continue;
				else
					break;
				}
			if(n==1||n<=0)
				return false;
			else if(i>n/2||n==2)
				return true;
			else
				return false;
}
public static String removeSpace(String s1)
{
	String s2=" ";
	int i;
	char ch[]=s1.toCharArray();
	for(i=0;i<ch.length-1;i++)
	{
		if(ch[i]==' ')
		s2=s2+ch[i+1];
		else
			s2=s2+ch[i];
		}
	if(ch[ch.length-1]!=' ')
		s2=s2+ch[i];
	return s2;
}
public static String lowerCase(String s1)
{
	String s2=" ";
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		int temp;
		if(ch[i]>=97&&ch[i]<=122)
		{
			s2=s2+ch[i];
		}
		else if(ch[i]>=65&&ch[i]<=90)
		{
			temp=(int)ch[i];
			temp=temp+32;
			s2=s2+(char)temp;
		}
	}
	return s2;
}
public static String upperCase(String s1)
{
	String s2=" ";
	int temp;
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=65&&ch[i]<=90)
		{
			s2=s2+ch[i];
		}
		else if(ch[i]>=97&&ch[i]<=122)
		{
			temp=(int)ch[i];
		temp=temp-32;
		s2=s2+(char)temp;
		}
	}
	return s2;
}
public static char [] sortChar(char ch[])
{
	for(int i=0;i<ch.length;i++)
	{
		for (int j=0;j<ch.length-1-i;j++)
		{
			if(ch[j]>ch[j+1])
			{
				char s1=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=s1;
			}
		}
	}
	return ch;
}
public static boolean anagram(String s1,String s2)
{
	String s6=Util.removeSpace(s1);
	String s7=Util.removeSpace(s2);
	System.out.println(s6);
	System.out.println(s7);
	if(s6.length()==s7.length())
	{
		String s3=Util.lowerCase(s6);
		String s4=Util.lowerCase(s7);
		System.out.println(s3);
		System.out.println(s4);
		char c1[]=s3.toCharArray();
		char c2[]=s4.toCharArray();
		char ch[]=Util.sortChar(c1);
		char ch1[]=Util.sortChar(c2);
		int i;
		for(i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			if(ch[i]==ch1[i])
				continue;
			else
				break;
		}
		if(i>=ch.length)
			return true;
		else
			return false;
	}
	else 
		return false;
	
}
public static void temperatureConversion()
{
	System.out.println("Press 1 for C to F conversion"
			+ "and press 2 for F to C conversion ");
	int n=Util.input();
	if(n==1)
	Util.cToF();
	else if(n==2)
     Util.fToC();
	else
		System.out.println("Press 1 or 2");
}
public static void cToF()
{
	System.out.println("Enter the temperature of celcius");
	double f;
	double d=Util.inputDouble();
	f= (d*(9/5)) + 32;
	System.out.println("fahrenheit temperature is" +f);
}
public static void fToC()
{
	System.out.println("Enter the temperature of fahrenhiet");
	double f;
	double d=Util.inputDouble();
	f= (d-32)*(9/5);
	System.out.println("celcius temperature is" +f);
}
public static int [] bubbleInteger(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		for (int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int k=a[j];
				a[j]=a[j+1];
				a[j+1]=k;
			}
		}
	}
	return a;
}
public static double payment(int P,double R, double Y)
{
	double r=R/(12*100);
	double n= 12*Y;
	double d=0;

	d=(P*r)/1-(Math.pow(1+r, -n));
	return d;
}
public static String tobinary(int n)
{
	String st=" ";
	while(n>0)
	{
		int r=n%2;
		st=st+r;
		n=n/2;
	}
	st=Util.reverse(st);
	return st;
}
public static String reverse(String s)
{
	String s2=" ";
	char ch[]=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		s2=s2+ch[i];
	}
	return s2;
	
}
public static void dayOfWeek(int d, int m, int y)
{
	 int y0 = y - (14 - m) / 12;
     int x = y0 + y0/4 - y0/100 +y0/400;
     int m0 = m + 12 * ((14 - m) / 12) - 2;
     int d0 = (d + x + 31 * m0 / 12) % 7;  
     String b=" ";
       if (d0==0)
       {
          b = "Sunday";
       } 
       else if (d0==1)
       {
          b = "Monday";
         } 
       else if (d0==2)
       {
            b = "Tuesday";
         } 
       else if (d0==3)
       {
             b = "Wednesday";
           }
       else if (d0==4)
       {
             b = "Thursday";
             } 
       else if (d0==5) {
                b = "Friday";
               } 
       else if (d0==6)
       {
                 b = "Saturday";
                 }                 
               

     System.out.println("The day of the week is " + b);
 }



}
