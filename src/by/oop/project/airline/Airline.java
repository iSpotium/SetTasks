package by.oop.project.airline;

public class Airline {
	private String destination;
	private int flightNumber;
	private String aircraftType;
	private double departureTime;
	private String daysOfTheWeek;

	public Airline() {
		destination = "";
		flightNumber = 0;
		aircraftType = "";
		departureTime = 0;
		daysOfTheWeek = "";
	}

	public Airline(String destination, int flightNumber, String aircraftType, double departureTime, String daysOfTheWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysOfTheWeek = daysOfTheWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public String getDaysOfTheWeek() {
		return daysOfTheWeek;
	}

	public void setDaysOfTheWeek(String daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", daysOfTheWeek=" + daysOfTheWeek + "]";
	}

}
