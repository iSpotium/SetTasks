package by.oop.project.clock;

import java.util.Objects;

public class Clock {
	private int hour;
	private int minutes;
	private int seconds;

	ClockLogic logic = new ClockLogic();

	public Clock() {
		hour = 0;
		minutes = 0;
		seconds = 0;
	}

	public Clock(int ho, int min, int sec) {
		if (sec > 59) {
			for (sec = sec; sec > 59;) {
				min++;
				sec = sec - 60;
			}
		}
		seconds = sec;

		if (min > 59) {
			for (min = min; min > 59;) {
				ho++;
				min = min - 60;
			}
		}
		minutes = min;
		hour = ho;

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		int addtohour = 0;

		if (minutes > 59) {
			for (minutes = minutes; minutes > 59;) {
				addtohour++;
				minutes = minutes - 60;
			}
		}
		this.minutes = minutes;
		this.hour = this.hour + addtohour;

	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		int addtomin = 0;
		int addtohour = 0;

		if (seconds > 59) {
			for (seconds = seconds; seconds > 59;) {
				addtomin++;
				seconds = seconds - 60;
			}
		}
		this.seconds = seconds;

		if (addtomin > 59) {
			for (addtomin = addtomin; addtomin > 59;) {
				addtohour++;
				addtomin = addtomin - 60;
			}
		}
		int temp;

		temp = this.minutes + addtomin;
		if (temp > 59) {
			for (temp = temp; temp > 59;) {
				addtohour++;
				temp = temp - 60;
			}
		}
		this.minutes = temp;
		this.hour = this.hour + addtohour;

	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minutes, seconds);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clock other = (Clock) obj;
		return hour == other.hour && minutes == other.minutes && seconds == other.seconds;
	}

	@Override
	public String toString() {
		return "Clock [hour=" + hour + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
