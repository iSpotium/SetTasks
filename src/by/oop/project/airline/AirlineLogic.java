package by.oop.project.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

	public boolean byDayAfterTime(Airline air) {
		String airDay = air.getDaysOfTheWeek();
		double time = air.getDepartureTime();

		if ((airDay.equals("Friday")) && (time > 15.30)) {
			return true;
		}
		return false;
	}

	public List<Airline> listDayAfterTime(List<Airline> air) {
		List rez = new ArrayList<Airline>();

		for (Airline i : air) {
			if (byDayAfterTime(i)) {
				rez.add(i);
			}
		}
		return rez;
	}

	public boolean byDestination(Airline air) {
		String airDes = air.getDestination();
		if (airDes.equals("Los Angeles")) {
			return true;
		}
		return false;
	}

	public List<Airline> listByDes(List<Airline> air) {
		List<Airline> rez = new ArrayList<Airline>();

		for (Airline i : air) {
			if (byDestination(i)) {
				rez.add(i);
			}
		}
		return rez;
	}

	public boolean checkByDayOfTheWeek(Airline air) {
		String airDay = air.getDaysOfTheWeek();
		if (airDay.equals("Monday")) {
			return true;
		}
		return false;
	}

	public List<Airline> listByDayOfTheWeek(List<Airline> air) {
		List<Airline> rez = new ArrayList<Airline>();

		for (Airline i : air) {
			if (checkByDayOfTheWeek(i)) {
				rez.add(i);
			}
		}
		return rez;
	}
}
