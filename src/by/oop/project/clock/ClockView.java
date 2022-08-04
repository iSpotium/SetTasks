package by.oop.project.clock;

public class ClockView {

	public void printClockBeforeСh(Clock cl) {
		System.out.println("Clock before changes");
		System.out.println(
				"(Hours: " + cl.getHour() + ") (Minutes: " + cl.getMinutes() + ") (Seconds: " + cl.getSeconds() + ")");
	}

	public void printClockAfterСh(Clock cl) {
		System.out.println("Clock after changes");
		System.out.println(
				"(Hours: " + cl.getHour() + ") (Minutes: " + cl.getMinutes() + ") (Seconds: " + cl.getSeconds() + ")");
	}

	public void valueAreCorrect(Clock cl) {
		System.out.println("Values are correct");
		System.out.println("(Hours: " + cl.getHour() + ") (Minutes: " + cl.getMinutes() + ") (Seconds: " + cl.getSeconds() + ")");

	}

	public void printClock(Clock cl) {
		System.out.println("(Hours: " + cl.getHour() + ") (Minutes: " + cl.getMinutes() + ") (Seconds: " + cl.getSeconds() + ")");

	}
	public void valueAreNotCorrect(Clock cl) {
		System.out.println("Values are not correct");
		System.out.println("All values are set to zero");
		System.out.println("(Hours: " + cl.getHour() + ") (Minutes: " + cl.getMinutes() + ") (Seconds: " + cl.getSeconds() + ")");

	}
}
