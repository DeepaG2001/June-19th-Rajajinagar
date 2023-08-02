package com.xworkz.dailyUse.app;

public class Coporator {

public String name;
	
	Building building=new Building("Shanti nilaya","Kuvempu Nagara",3);
	Building building1=new Building("Shrinidhi pg for boys","rajajiNagar",34);
	public Building[] buildings={building,building1};

	public Coporator(String name)
	{
		this.name = name;
	}

	public void printInfo() {
		System.out.println("\n");
		System.out.println("Corporator name is "+this.name);
		for(int i=0;i<buildings.length;i++)
		{
			Building building=buildings[i];
			building.printInfo();
		}
	}
	
	
}
