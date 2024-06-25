package org.ContractPod.Day6Programms;

import java.util.Scanner;

public class FibonnachiSeries {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number till you want Fibonacci series");
		int n = sc.nextInt();
		int a=0,b=1;
		System.out.println("Fibonacci Series :-");
		System.out.println(a);
		System.out.println(b);
		for(int i = 1;i<=n-2;i++)
		{
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
