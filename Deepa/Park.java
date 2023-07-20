class Park{
	
	String name;
	String location;
	int noOfPaths;
	boolean hasPlayground;
	boolean hasSportsFacilities;
	int parkingCapacity;
	int noOfBranch;
	boolean isOpen;
	boolean hasCafeteria;
	
	Park()
	{
		
		System.out.println("invoking no-arg const of  Park");
		
	}
    Park(String name,String location)
	{
		this.name=name;
		this.location=location;
		System.out.println("invocking name location const of Park ");
	}
	
	Park(String name,String location,int noOfPaths)
	{
		this(name,location);
		this.noOfPaths=noOfPaths;
		System.out.println("invocking name location noOfPaths const of Park ");
	}
	
    Park(String name,String location,int noOfPaths,boolean hasPlayground)
	{
		this(name,location,noOfPaths);
		this.hasPlayground=hasPlayground;
		System.out.println("invocking name location noOfPaths hasPlayground const of Park ");
		
	}
	
	
    Park(String name,String location,int noOfPaths,boolean hasPlayground,boolean hasSportsFacilities)
	{
		this(name,location,noOfPaths,hasPlayground);
		this.hasSportsFacilities=hasSportsFacilities;
		System.out.println("invocking name location noOfPaths hasPlayground hasSportsFacilities const of Park ");
		
	}
	Park(String name,String location,int noOfPaths,boolean hasPlayground,boolean hasSportsFacilities,int parkingCapacity)
	{
		this(name,location,noOfPaths,hasPlayground,hasSportsFacilities);
		this.parkingCapacity=parkingCapacity;
		System.out.println("invocking name location noOfPaths hasPlayground hasSportsFacilities parkingCapacity const of Park ");
		
	}
	 Park(String name,String location,int noOfPaths,boolean hasPlayground,boolean hasSportsFacilities,int parkingCapacity,int noOfBranch)
	{
		this(name,location,noOfPaths,hasPlayground,hasSportsFacilities,parkingCapacity);
		this.noOfBranch=noOfBranch;
		System.out.println("invocking name location noOfPaths hasPlayground hasSportsFacilities parkingCapacity noOfBranch const of Park ");
	}
	Park(String name,String location,int noOfPaths,boolean hasPlayground,
	boolean hasSportsFacilities,int parkingCapacity,int noOfBranch,boolean isOpen)
	{
		this(name,location,noOfPaths,hasPlayground,hasSportsFacilities,parkingCapacity,noOfBranch);
		this.isOpen=isOpen;
		System.out.println("invocking name location noOfPaths hasPlayground hasSportsFacilities parkingCapacity noOfBranch isOpen const of Park ");
	}
	Park(String name,String location,int noOfPaths,boolean hasPlayground,
	boolean hasSportsFacilities,int parkingCapacity,int noOfBranch,boolean isOpen,boolean hasCafeteria)
	{
		this(name,location,noOfPaths,hasPlayground,hasSportsFacilities,parkingCapacity,noOfBranch,isOpen);
		this.hasCafeteria=hasCafeteria;
		System.out.println("invocking name location noOfPaths hasPlayground hasSportsFacilities parkingCapacity noOfBranch isOpen hasCafeteria const of Park ");
	    System.out.println(name);
		System.out.println(location);
		System.out.println(noOfPaths);
		System.out.println(hasPlayground);
		System.out.println(hasSportsFacilities);
		System.out.println(parkingCapacity);
		System.out.println(noOfBranch);
		System.out.println(isOpen);
		System.out.println(hasCafeteria);
		
	}	
}
