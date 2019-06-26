package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r1= ()-> System.out.println("th1 Run method executed by" + Thread.currentThread().getName());
Runnable r2= ()-> System.out.println("th2 Run method executed by" + Thread.currentThread().getName());
Runnable r3= ()-> System.out.println("th3 Run method executed by" + Thread.currentThread().getName());

//ExecutorService e=Executors.newSingleThreadExecutor();
ExecutorService e=Executors.newFixedThreadPool(8);
e.execute(r1);
e.execute(r2);
e.execute(r3);

e.shutdown();
	}

}
