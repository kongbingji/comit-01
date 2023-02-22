package com.comit.course;
import java.util.Scanner;

public class HomeWork16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter a Number:");

		Scanner input = new Scanner(System.in);
		
		int j = input.nextInt();
		
		int a = 0;
		
		for(int i=j; i<=j+100; i++)
		{
			a = a+i;
		}
		System.out.println(a);
		
		
	}

}
