package com.gl.DSA.GradedAssignment2.Skyscraper;

import java.util.Scanner;

public class SkyScraper {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of "+ " floors in the building : ");
		int n = sc.nextInt();
		int A[] = new int[n + 1];
		for (int i = 1; i < n + 1; i++) 
		{
			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			A[m] = i;
		}
		int j = n;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		for (int i = 1; i <= n; i++)
		{
			flag = false;
			System.out.println();
			System.out.println("Day " + i + " :");
			
			while (j >= 1 && A[j] <= i) 
			{
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if (flag == true) 
			{
				System.out.println();
			}
		}
		sc.close();
	}
}
