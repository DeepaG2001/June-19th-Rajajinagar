package com.xworkz.mall.boot;

import com.xworkz.mall.app.AcademicProject;
import com.xworkz.mall.app.FinalProject;

public class ProjectRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in projectRunner");
		
		AcademicProject ref =new FinalProject();
		ref.blockDiag();
		ref.daigram();
		ref.isAlgorithm();
		ref.isWorking();
		ref.logic();
		ref.material();
		ref.noOfPages();
		ref.program();
		ref.report();
		ref.slides();
		
	}
}
