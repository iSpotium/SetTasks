package by.oop.project.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineDataView {
	public void printAirList(List<Airline> list) {
		for (Airline i : list)
			System.out.println("Destination: " + i.getDestination() + "| Flight number: " + i.getFlightNumber()
			+ "| Aircraft type: " + i.getAircraftType() + "| Departure time: " + i.getDepartureTime()
			+ "| Days of the week: " + i.getDaysOfTheWeek());

	}

	public void printByDestination(List<Airline> airs) {
		System.out.println("List by Destination (Los Angeles)");
		for (Airline i : airs) {
			System.out.println("Destination: " + i.getDestination() + "| Flight number: " + i.getFlightNumber()
					+ "| Aircraft type: " + i.getAircraftType() + "| Departure time: " + i.getDepartureTime()
					+ "| Days of the week: " + i.getDaysOfTheWeek());
		}
	}

	public void printByDayOfTheWeek(List<Airline> airs) {
		System.out.println("List by Day of the week (Monday)");
		
		for (Airline i : airs) {
			System.out.println("Days of the week: " + i.getDaysOfTheWeek() + "| Flight number: " + i.getFlightNumber()
					+ "| Aircraft type: " + i.getAircraftType() + "| Departure time: " + i.getDepartureTime()
					+ "| Destination: " + i.getDestination());
		}
	}
	public void printByDayAfterTime(List<Airline> airs) {
		System.out.println("List by Day of the week (Friday) and time (15:30)");
		
		for (Airline i : airs) {
			System.out.println("Days of the week: " + i.getDaysOfTheWeek() +"| Departure time: " + i.getDepartureTime() + "| Flight number: " + i.getFlightNumber()
					+ "| Aircraft type: " + i.getAircraftType() 
					+ "| Destination: " + i.getDestination());
		}
	}
}
