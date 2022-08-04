package by.oop.project.clock;

public class ClockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock(19,54,45);
		ClockView view = new ClockView();
		ClockLogic log = new ClockLogic();
		
		view.printClockBeforeСh(clock);
		System.out.println();
		
		int addtosec = 15;
		int addtomin = 5;
		int addtohour = 2;
		
		clock.setSeconds(log.addToSec(clock, addtosec));
		clock.setMinutes(log.addToMin(clock, addtomin));
		clock.setHour(log.addToHour(clock, addtohour));
		
		view.printClockAfterСh(clock);
		System.out.println();
		
		log.correctnessCheck(clock);
		
	}
}