package edu.kh.collection.run;

import edu.kh.collection.model.service.CollectionService;
import edu.kh.collection.model.service.StudentManagementService;

public class CollectionRun {

	public static void main(String[] args) {
		
		CollectionService service = new CollectionService();
//		service.example1();
//		service.example2();
//		service.example3();
//		service.example4();
//		service.example7();
		
		StudentManagementService stdService = new StudentManagementService();
		stdService.displayMenu();
		
		
		
		
		
	}
}
