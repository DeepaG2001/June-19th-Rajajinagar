package com.xworkz.mall.app;

public class FinalProject extends AcademicProject {
	@Override
	public void daigram() {

	}

	@Override
	public boolean material() {
		System.out.println("material in FinalProject");
		return true;

	}

	@Override
	public void report() {
System.out.println("report in FinalProject");
	}

	@Override
	public void program() {
System.out.println("program in FinalProject");
	}

	@Override
	public void logic() {
System.out.println("logic in FinalProject");
	}

	@Override
	public boolean slides() {
		System.out.println("slides in FinalProject");
		return true;
	}

	@Override
	public void blockDiag() {
		System.out.println("blockDiag in FinalProject");
	}

	@Override
	public int noOfPages() {
		System.out.println("noOfPages in FinalProject");
		return 40;
	}

	@Override
	public boolean isWorking() {
		System.out.println("isworking in FinalProject");
		return true;
	}

	@Override
	public boolean isAlgorithm() {
		System.out.println("isAlgorithm in FinalProject");
		return false;
		
	}
}
