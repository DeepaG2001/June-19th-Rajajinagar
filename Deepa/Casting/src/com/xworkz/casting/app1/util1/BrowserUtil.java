package com.xworkz.casting.app1.util1;

import com.xworkz.casting.app1.*;

public class BrowserUtil extends Browser {

	public static void run(Browser browser) {

		System.out.println(browser.search);
		browser.technology();

		if (browser instanceof ChromeBrowser) 
		{
			System.out.println("browser is ChromeBrowser");

			ChromeBrowser chromeBrowser = (ChromeBrowser) browser;
			System.out.println(chromeBrowser.information);
			chromeBrowser.advance();
		}
		
		if (browser instanceof OperaBrowser) {
			System.out.println("browser is Opera");

			OperaBrowser operaBrowser = (OperaBrowser) browser;
			System.out.println(operaBrowser.operaOption);
			operaBrowser.store();
		}
		if (browser instanceof FireFox) {
			System.out.println("showroom is watch");

			FireFox fireFox = (FireFox) browser;
			System.out.println(fireFox.username);
			fireFox.timeout();
		}
		
	}
}

