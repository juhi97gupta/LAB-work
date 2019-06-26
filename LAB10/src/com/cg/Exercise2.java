package com.cg;

//import java.sql.Date;
import java.util.TimerTask;
import java.util.*;

public class Exercise2 extends TimerTask implements Runnable{
	public void run() {
		while(true) {
		System.out.println("Timer task started at : "+new Date());
		CompleteTask();
	}}
	public void CompleteTask() {
		try {
		Thread.sleep(10000);
		}
		
				catch(InterruptedException e) {
		e.printStackTrace();
				}
	}
public static void main(String args[])
{
	Runnable r= new Exercise2();
	Thread th=new Thread(r);
	th.start();
}
}
