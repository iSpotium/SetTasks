package by.oop.project.counter;

public class CounterLogic {

	CounterView view = new CounterView();

	public int counterPlus(Counter c, int needAdd) {
		boolean check = c.isStatus();
		int rez = c.getPresentValue();
		int val = c.getPresentValue();

		if (check == true) {
			rez = val + needAdd;
		} else {
			view.printCounteOff();
		}
		return rez;

	}

	public int counterMinus(Counter c, int needMinus) {
		boolean check = c.isStatus();
		int rez = c.getPresentValue();
		int val = c.getPresentValue();

		if (check == true) {
			rez = val - needMinus;
		} else {
			view.printCounteOff();
		}
		return rez;
	}

	public boolean stateChange(Counter c) {
		boolean i = c.isStatus();

		if (i == true) {
			return false;
		}
		return true;
	}

}