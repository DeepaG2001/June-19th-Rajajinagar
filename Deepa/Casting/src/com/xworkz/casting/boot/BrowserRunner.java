package com.xworkz.casting.boot;

import com.xworkz.casting.app1.*;
import com.xworkz.casting.app1.util1.*;

public class BrowserRunner {

	public static void main(String[] args) {
	
			System.out.println("invocking main in BrowserRunner");
			
			Browser browser=new Browser();
			
			ChromeBrowser chromeBrowser=new ChromeBrowser();
			OperaBrowser operaBrowser=new OperaBrowser();
			Edge edge=new Edge();
			FireFox fireFox=new FireFox();
			
			BrowserUtil.run(browser);
			BrowserUtil.run(operaBrowser);
			BrowserUtil.run(chromeBrowser);
			BrowserUtil.run(fireFox);
			BrowserUtil.run(edge);
		}
	}

