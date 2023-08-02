package com.xworkz.deepa.app;

public class Nurse {

	public String nurseSpecialty = "Surgery";
	public boolean currentlyOnDuty = true;
	public Patient  patient = new Patient();
	
	public void treatment()
	{
		System.out.println("invoking treatment in nurse");
	}
	public void caring()
	{
		System.out.println("invoking caring in nurse");
	}
}
