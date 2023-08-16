package com.xworkz.good.boot;

import com.xworkz.good.app.Biscuit;
import com.xworkz.good.app.Cave;
import com.xworkz.good.app.Flag;
import com.xworkz.good.app.Karchief;
import com.xworkz.good.app.Logo;
import com.xworkz.good.app.Pendant;

public class BiscuitRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in Runner");
		Biscuit ref = new Biscuit();
		System.out.println(ref);
		
	
		Biscuit ref1 = new Biscuit("parle",10,true);
		System.out.println(ref1);
		
		Biscuit ref2 = new Biscuit("Goodday",5,false);
		System.out.println(ref2);
		
		System.out.println("\n");
		
		Flag flag=new Flag();
		System.out.println(flag);
		Flag flag1=new Flag("India","Silk","Safron White Green");
		System.out.println(flag1);
		Flag flag2=new Flag("India","Plastic","Safron White Green");
		System.out.println(flag2);
		System.out.println("\n");
		
		Logo logo =new Logo();
		System.out.println(logo);
		Logo logo1 =new Logo("Deepa",24,1999,"red","04\10\2001");
		System.out.println(logo1);
		Logo logo2 =new Logo();
		System.out.println(logo2);
		System.out.println("\n");
		
		Karchief karchief=new Karchief();
		System.out.println(karchief);
		Karchief karchief1=new Karchief("Cotton",20,2,"white",'s',20,true);
		System.out.println(karchief1);
		Karchief karchief2=new Karchief("Woolen",40,2,"pink",'l',60,false);
		System.out.println(karchief2);
		System.out.println("\n");
		
		Cave cave=new Cave();
		System.out.println(cave);
		Cave cave1=new Cave(22,15,true,true,false,true,10,true,"mountain",200);
		System.out.println(cave1);
		Cave cave2=new Cave(21,10,true,true,true,true,5,true,"mid Forest",500);
		System.out.println(cave2);
		System.out.println("\n");
		
		Pendant ref3=new Pendant();
		System.out.println(ref3);
		Pendant ref4=new Pendant(true,true,"Long","Gold","BlackStone",25,"Red",30,15,true,true,false);
		System.out.println(ref4);
		Pendant ref5=new Pendant(true,true,"short","Gold","RedStone",25,"Red",30,15,true,true,false);
		System.out.println(ref5);
		
		
		
	}
}
