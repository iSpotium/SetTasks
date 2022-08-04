package by.oop.project.state;

import java.util.List;

public class StateView {
	public void showTheCapital(State state) {
		Town s = state.getCapital();
		System.out.println("State capital: " + s.getName());
	}

	public void printCountState(int count) {
		System.out.println("In the country " + count + " regions");
	}

	public void printStateSquare(double square) {
		System.out.println("Total area of the country: " + square);
	}

	public void printRegCenter(Region reg) {
		Town t = reg.getRegCenter();
			System.out.println("Regional center: " + t.getName());
		}
	}
