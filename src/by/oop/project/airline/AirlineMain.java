package by.oop.project.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineMain {

	public static void main(String[] args) {
		AirlineDataView airview = new AirlineDataView();
		List<Airline> listAir = new ArrayList();
		AirlineLogic log = new AirlineLogic();
		List<Airline> listByDes = new ArrayList();
		List<Airline> listByDayOfTheWeek = new ArrayList();
		List<Airline> listByDayAfterTime = new ArrayList();
		
		listAir.add(new Airline("Los Angeles", 758, "Airbus", 21.45, "Friday"));
		listAir.add(new Airline("New York", 614, "Airbus", 11.22, "Monday"));
		listAir.add(new Airline("Los Angeles", 688, "Boeing", 10.55, "Monday"));
		listAir.add(new Airline("Los Angeles", 767, "Airbus", 15.25, "Friday"));
		listAir.add(new Airline("Boston", 404, "Boeing", 17.42, "Friday"));
		
		airview.printAirList(listAir);
		System.out.println();
		
		listByDes = log.listByDes(listAir);
		airview.printByDestination(listByDes);
		System.out.println();
		
		listByDayOfTheWeek = log.listByDayOfTheWeek(listAir);
		airview.printByDayOfTheWeek(listByDayOfTheWeek);
		System.out.println();
		
		listByDayAfterTime = log.listDayAfterTime(listAir);
		airview.printByDayAfterTime(listByDayAfterTime);
	}

}
