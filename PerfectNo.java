package org.ContractPod.Day6Programms;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether the no is perfect or not");
		int n = sc.nextInt();
		int sum=0;
		for(int i =1;i<n;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" not a perfect number");
		}
		
	}

}
