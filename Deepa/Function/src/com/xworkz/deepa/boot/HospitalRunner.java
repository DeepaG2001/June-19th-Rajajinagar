package com.xworkz.deepa.boot;

import com.xworkz.deepa.app.*;
	

public class HospitalRunner {

	public static void main(String[] args) {

		System.out.println("invoking  main in HospitalRunner");
		
		Hospital hospital = new Hospital();
		
		System.out.println(hospital.hospitalName);
		System.out.println(hospital.isPublicHospital);
		
		hospital.treatment();
		hospital.checkUp();
		
		Doctor doctor = hospital.doctor;
		doctor.operation();
		System.out.println("name:"+doctor.name);
		System.out.println("operation:"+doctor.operation);
		
	    Nurse nurse = doctor.nurse;
	    nurse.caring();
	    System.out.println("nurseSpecialty:"+nurse.nurseSpecialty);
	    System.out.println("nurseSpecialty:"+nurse.nurseSpecialty);
	    
	    Patient patient = nurse.patient;
	    patient.bedRest();
	    patient.recovery();
	    System.out.println("diseases:"+patient.disease);
	    System.out.println("checkUpBill:"+patient.checkUpBill);
	    
	}


}
