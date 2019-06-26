package com.cg;

public class MyRunnable implements Runnable {
	public void run()
	{
		System.out.println("HBD Sanah" +Thread.currentThread().getName());
	}

}
