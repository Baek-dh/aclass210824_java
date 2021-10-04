package kh.edu.updown.run;

import kh.edu.updown.model.service.MainService;

public class UpDownRun {
	public static void main(String[] args) {
		
		MainService service = new MainService();
		service.displayMenu();
	}
}
