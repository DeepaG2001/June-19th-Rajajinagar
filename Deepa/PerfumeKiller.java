class PerfumeKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in PerfumeKiller");
		
		Perfume perfume=new Perfume("Rose","20-05-2023");
		Perfume.printStatic();
		perfume.printInstance();
		
		System.out.println("\n");
		
		Perfume perfume1=new Perfume("Lily","01-053-2023");
		Perfume.printStatic();
		perfume.printInstance();
		
	}
}