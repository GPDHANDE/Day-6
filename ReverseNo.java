package org.ContractPod.Day6Programms;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int n = sc.nextInt();
		int reminder = 0;
		while(n!=0)
		{
			int digit = n%10;
			reminder = reminder*10 + digit;
			n=n/10;
		}
		System.out.println("Reversed Number is "+ reminder);
	}

}
