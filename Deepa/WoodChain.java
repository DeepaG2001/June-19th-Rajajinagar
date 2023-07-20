class WoodChain{
	
	String woodType;
	double weight;
	int quantityInStock;
	boolean seasoned;
	int moisture;
	
	WoodChain()
	{
		
		System.out.println("invoking no-arg const of  WoodChain");
		
	}
	
	WoodChain(String woodType,double weight)
	{
	    this.woodType=woodType;
		this.weight=weight;
		System.out.println("invocking string, int const of WoodChain ");
	
	}
	
	WoodChain(String woodType,double weight,int quantityInStock)
	{
		this(woodType,weight);
		this.quantityInStock=quantityInStock;
		System.out.println("invocking string, double, int const of WoodChain ");
		System.out.println(woodType);
		System.out.println(weight);
		System.out.println(quantityInStock);
	}
	
	WoodChain(String woodType,double weight,int quantityInStock,boolean seasoned)
	{
		this(woodType,weight,quantityInStock);
		this.seasoned=seasoned;
		System.out.println("invocking string, double,int,boolean const of WoodChain ");
	}
	
     WoodChain(String woodType,double weight,int quantityInStock,boolean seasoned,int moisture)
	{
		this(woodType,weight,quantityInStock,seasoned);
		this.moisture=moisture;
		System.out.println("invocking string, int,int const of WoodChain ");
		
	}
}