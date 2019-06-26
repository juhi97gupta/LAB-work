package com.cg;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		System.out.println("enter the limit upto which you want prime number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime(n);
	
		
		
		// TODO Auto-generated method stub

	}
	public static void Prime(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==2) {
				break;
			}
			System.out.println(n);
	}

	}}
