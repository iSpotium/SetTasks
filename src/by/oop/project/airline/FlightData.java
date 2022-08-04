package by.oop.project.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightData {

	private List<Airline> airline;

	public FlightData() {
		airline = new ArrayList<Airline>();
	}

	public void addToData(Airline air) {
		airline.add(air);
	}

	public List<Airline> getAirline() {
		return airline;
	}

	public void setAirline(List<Airline> airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "FlightData [airline=" + airline + "]";
	}

}
