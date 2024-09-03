package com.tnsif.day11.ThreadandMultithread;

public class ChildThread extends Thread
{
	
	private int n;
	private String msg;
	
	public ChildThread(int n,String msg) 
	{
		this.n=n;
		this.msg=msg;
	}
	public void run() 
	{
		for(int i=1;i<=n;i++)
		{
			try {
				Thread.sleep(300);
			}
			catch (Exception e) {
				System.out.println("Thread interrupted"+e.getMessage());
			}
			System.out.println(msg+i+" "+Thread.currentThread().getName());
		}
	}
}
