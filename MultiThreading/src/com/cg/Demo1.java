package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r= ()-> System.out.println("Run method executed by" + Thread.currentThread().getName());
Executor e=Executors.newSingleThreadExecutor();
e.execute(r);
e.execute(r);
e.execute(r);
	}

}
