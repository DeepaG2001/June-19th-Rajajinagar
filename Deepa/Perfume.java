class Perfume{
	
	static String brand;
	static String gstNo;
	String fragrance;
	String manfDate;


    Perfume(String fragrance,String manfDate)   //init two instance variables using constructor
	{
		this.fragrance=fragrance;
		this.manfDate=manfDate;
		System.out.println("invocking String, String in Perfume");
		System.out.println("\n");
	}	
	//init static variables, during class loading
	
	static {                           ///init two static variables using constructor
		brand="Old Monk";
		gstNo="09AA0K6247D129";
		System.out.println("invocking static block in Perfume");
		System.out.println("\n");
	}
	
	static void printStatic()            //one static method to print static variables
	{
        System.out.println("Running printStatic block in Perfume");
		System.out.println(brand);
		System.out.println(gstNo);
		System.out.println("\n");
	}
	
	void printInstance()                    ////one static method to print instance variables
	{
		System.out.println("Running printInstance block in Perfume");
		System.out.println(this.fragrance);
		System.out.println(this.manfDate);
	}
}