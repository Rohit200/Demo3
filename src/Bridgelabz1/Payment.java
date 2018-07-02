package Bridgelabz1;
import Bridgelaz.Util.*;
public class Payment
{
public static void main(String[] args)
{
	System.out.println("enter the principal amount");
		int P=Util.input();
		System.out.println("enter the interest rate");
		double R=Util.inputDouble();;
		System.out.println("enter year");
		double Y=Util.inputDouble();
		double d= Util.payment(P,R,Y);
        System.out.println(d);
	}


}


