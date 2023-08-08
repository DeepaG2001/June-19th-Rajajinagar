package com.xworkz.deepa.boot;

import com.xworkz.deepa.app.*;

public class CoalRunner
{
	public static void main(String[] args)
	{
		System.out.println("invocking main CoalRunner");
		
		Coal coal=new LigniteCoal();
		coal.burn();
		coal.fire();
		System.out.println("\n");
		
		Amoeba amoeba =new EukaryoteAmoeba();
		amoeba.swim();
		System.out.println("\n");
		
		Bangle bangle=new GoldBangle();
		bangle.sound();
		bangle.broken();
		System.out.println("\n");
		
		Gate gate=new RailwayGate();
		gate.open();
		System.out.println("\n");
		
		Dinosaur di=new Dino();
		di.kill();
		System.out.println("\n");
		
		Flex ref=new Flexable();
	     ref.strech();
	     System.out.println("\n");
	     
	     Mic ref2=new Recorder();
	     ref2.Speak();
	     System.out.println("\n");  
	     
	     Drum drum=new Container();
	     drum.fillimg();
	     System.out.println("\n");
	     
	     Theater ref3=new Movie();
	     ref3.watchingMovie();
	     System.out.println("\n");
	     
	     Ticket ref4=new BookMyShow();
	     ref4.booking();
	     
	}
		
}

