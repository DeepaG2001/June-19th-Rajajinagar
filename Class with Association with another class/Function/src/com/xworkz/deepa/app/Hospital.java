package com.xworkz.deepa.app;

public class Hospital {
	

	public String hospitalName = "City Center";
	public boolean isPublicHospital = true;
	public Doctor doctor = new Doctor();
	
	
	public void treatment()
	{
		System.out.println("invoking treatment in hospital");
		this.doctor.treatment();
		
	}
	
	public void checkUp()
	{
		System.out.println("invoking checkUp in hospital");
	}


}
