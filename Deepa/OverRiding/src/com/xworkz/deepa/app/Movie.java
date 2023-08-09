package com.xworkz.deepa.app;

public class Movie extends Theater {
	
	@Override
	public boolean watchingMovie()
	{
		System.out.println("invocking watchingMovie in Movie");
		return true;
		
	}

}
