package by.oop.project.clock;

public class ClockLogic {
	ClockView view = new ClockView();

	public int addToSec(Clock cl, int addsec) {

		int newsec = cl.getSeconds() + addsec;

		return newsec;
	}

	public int addToMin(Clock cl, int addmin) {
		int newmin = cl.getMinutes() + addmin;

		return newmin;
	}

	public int addToHour(Clock cl, int addhour) {
		int newhour = cl.getHour() + addhour;

		return newhour;
	}

	public void correctnessCheck(Clock cl) {
		int hour = cl.getHour();

		if (hour < 24) {
			view.valueAreCorrect(cl);
		}else {
			cl.setSeconds(0);
			cl.setMinutes(0);
			cl.setHour(0);
			view.valueAreNotCorrect(cl);
		}
	}
		
}

