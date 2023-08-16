package com.xworkz.good.app;

public class Pendant {

	private boolean isLocket;
	private boolean isAdjustableChain;
	private String chainType;
	private String material;
	private String gemstone;
	private double weight;
	private String color;
	private int length;
	private int width;
	private boolean isSilver;
	private boolean isGoldPlated;
	private boolean isDiamond;
	
	public Pendant() {
		super();
		System.out.println("invocking no args in pendant");
	}
	
	public Pendant(boolean isLocket, boolean isAdjustableChain, String chainType, String material, String gemstone,
			double weight, String color, int length, int width, boolean isSilver, boolean isGoldPlated,
			boolean isDiamond) {
		super();
		System.out.println("invocking pendant");
		this.isLocket = isLocket;
		this.isAdjustableChain = isAdjustableChain;
		this.chainType = chainType;
		this.material = material;
		this.gemstone = gemstone;
		this.weight = weight;
		this.color = color;
		this.length = length;
		this.width = width;
		this.isSilver = isSilver;
		this.isGoldPlated = isGoldPlated;
		this.isDiamond = isDiamond;
	}
	@Override
	public String toString() {
		return ("Locket:"+this.isLocket +"Adjustable:"+this.isAdjustableChain +
		"ChainType:"+this.chainType+ "Material:"+this.material +"Gemstone:"+this.gemstone+ "Weight:"+this.weight+"Color:"+this.color +
		"Length:"+this.length+ "Width:"+this.width +"Silver:"+this.isSilver +"GoldPlate:"+this.isGoldPlated +"Diamond:"+this.isDiamond );
	
	}

	
}
