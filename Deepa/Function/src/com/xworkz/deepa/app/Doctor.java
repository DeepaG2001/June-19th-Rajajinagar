package com.xworkz.deepa.app;

public class Doctor {
	
	public String name = "Rjesh";
	public boolean operation = false;
	public Nurse nurse  = new Nurse();
	
	
	public void treatment()
	{
		System.out.println("invoking treatment in Doctor");
		this.nurse.treatment();
	}
	public void operation()
	{
		System.out.println("invoking operation in Doctor");
	}

}
