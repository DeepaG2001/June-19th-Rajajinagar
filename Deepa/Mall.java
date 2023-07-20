class Mall{
	
	String name;
	String location;
	int noOfFloors;
	boolean hasParking;
	boolean hasMovieTheater;
	int noOfEscalators;
	int securityLevel;
	
	Mall()
	{
		
		System.out.println("invoking no-arg const of  Mall");
		
	}
	Mall(String name,String location)
	{
		this.name=name;
		this.location=location;
		System.out.println("invocking string, double,int,boolean const of Mall ");
	}
	
	Mall(String name,String location,int noOfFloors)
	{
		this(name,location);
		this.noOfFloors=noOfFloors;
		System.out.println("invocking string, double,int,boolean const of Mall ");
	}
	
    Mall(String name,String location,int noOfFloors,boolean hasParking)
	{
		this(name,location,noOfFloors);
		this.hasParking=hasParking;
		System.out.println("invocking string, int,int const of Mall ");
		
	}
	
	
	Mall(String name,String location,int noOfFloors,boolean hasParking,boolean hasMovieTheater)
	{
		this(name,location,noOfFloors,hasParking);
		this.hasMovieTheater=hasMovieTheater;
		System.out.println("invocking string, int,int const of Mall ");
		
	}
	Mall(String name,String location,int noOfFloors,boolean hasParking,boolean hasMovieTheater,int noOfEscalators)
	{
		this(name,location,noOfFloors,hasParking,hasMovieTheater);
		this.noOfEscalators=noOfEscalators;
		System.out.println("invocking string, int,int const of Mall ");
		
	}
	 Mall(String name,String location,int noOfFloors,boolean hasParking,boolean hasMovieTheater,int noOfEscalators,int securityLevel)
	{
		this(name,location,noOfFloors,hasParking,hasMovieTheater,noOfEscalators);
		this.securityLevel=securityLevel;
		System.out.println("invocking string, int,int const of Mall ");
		System.out.println(name);
		System.out.println(location);
		System.out.println(noOfFloors);
		System.out.println(hasParking);
		System.out.println(noOfEscalators);
		
	}
	
	
}