package com.cg;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1,b=1,c=0;


System.out.println("Enter the limit");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
FibonacciNonRecursive(a,b,c,n);

int d=FibonacciRecursive(n);
System.out.println(d);
	}
	
	public static void FibonacciNonRecursive(int a,int b,int c,int n) {
for(int i=1;i<=n-2;i++) {
	c=a+b;
	a=b;
	b=c;
	
}
	System.out.println(c);
	}
	
	public static int FibonacciRecursive(int n) {
		
			if(n==0)
				return 0;
			if(n==1)
				return 1;
			else
				 return (FibonacciRecursive(n-1) + FibonacciRecursive(n-2) );

		

}}