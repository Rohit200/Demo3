package Bridgelabz1;
import Bridgelaz.Util.*;
public class DayOnDate 
{
public static void main(String[] args)
{
		System.out.println("Enter the date");
		int d=Util.input();
		if(d<1 &&d>31)
		{
			System.out.println("Enter the date between 1 to 31");
		}
		System.out.println("Enter the month");
		int m=Util.input();
		if(d<1 &&d>12)
		{
			System.out.println("Enter the date between 1 to 12");
		}
		System.out.println("Enter the year");
		int y=Util.input();
		Util.dayOfWeek(d,m,y);
	

	}

}
