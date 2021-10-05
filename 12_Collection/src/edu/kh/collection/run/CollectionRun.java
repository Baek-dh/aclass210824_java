package edu.kh.collection.run;

import edu.kh.collection.model.service.CollectionService;
import edu.kh.collection.model.service.MapService;
import edu.kh.collection.model.service.SetService;
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
		//stdService.displayMenu();
		
		
		SetService sService = new SetService();
		//sService.example1();
//		sService.example2();
//		sService.example3();
//		sService.example4();
		
		MapService mService = new MapService();
//		mService.example1();
		mService.example2();
		
		
		
		
		
	}
}
