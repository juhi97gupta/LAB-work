package com.cg;
import java.lang.Math;
import java.util.Scanner;


interface printEepression{
	public long print(int x,int y);
}

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEepression pe=(x,y)->(int) Math.pow(x, y);
		Scanner sc=new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
				long e= pe.print(x,y);
		System.out.println(e);
	}

}
