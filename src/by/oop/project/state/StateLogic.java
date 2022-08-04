package by.oop.project.state;

import java.util.List;

public class StateLogic {
	public int countTheAreas(State state) {
		int numOfReg = 0;
		List<Region> region = state.getState();

		for (Region i : region) {
			numOfReg++;
		}
		return numOfReg;
	}

	public double countSquare(List<Town> t) {
		double square = 0;
		
		for(Town i : t) {
			square = square + i.getArea();
		}

		return square;
	}

}