package by.oop.project.state;

import java.util.ArrayList;
import java.util.List;

public class StateMain {

	public static void main(String[] args) {

		List<Town> tow = new ArrayList<Town>();

		tow.add(new Town("Brest", 344000, 146.1));
		tow.add(new Town("Bereza", 30171, 50.5));
		tow.add(new Town("Baranovichi", 175100, 84.96));

		List<Town> tow2 = new ArrayList<Town>();

		tow2.add(new Town("Minsk", 1975000, 348.8));
		tow2.add(new Town("Lida", 101165, 45.8));
		tow2.add(new Town("Nesvij", 15434, 177.3));

		List<Town> tow3 = new ArrayList<Town>();

		tow3.add(new Town("Gomel", 508839, 139.8));
		tow3.add(new Town("Turov", 3100, 5.46));
		tow3.add(new Town("Mozir", 111801, 44.14));

		List<Town> tow4 = new ArrayList<Town>();

		tow4.add(new Town("Vitebsk", 362466, 124.5));
		tow4.add(new Town("Miori", 7896, 10.3));
		tow4.add(new Town("Lepel", 17280, 33.4));
////////////////////////////////////////////////////////////////////////////////
		District dis1 = new District(tow);
		District dis2 = new District(tow2);
		District dis3 = new District(tow3);
		District dis4 = new District(tow4);

		List<District> disFir = new ArrayList<District>();

		disFir.add(dis1);
		disFir.add(dis2);

		List<District> disSec = new ArrayList<District>();

		disSec.add(dis3);
		disSec.add(dis4);
//////////////////////////////////////////////////////////////////////////////////
		Region reg1 = new Region(disFir);
		Region reg2 = new Region(disSec);
		
		State state = new State();
		
		state.add(reg1);
		state.add(reg2);
///////////////////////////////////////////////////////////////////////////////////
		int count = 0;
		state.setCapital(tow2, count);
		
		StateView view = new StateView();
		
		view.showTheCapital(state);
		StateLogic log = new StateLogic();
		
		int numOfReg;
		numOfReg = log.countTheAreas(state);
		view.printCountState(numOfReg);
		
		double allArea;
		allArea = log.countSquare(tow) + log.countSquare(tow2) + log.countSquare(tow3) + log.countSquare(tow4);
		view.printStateSquare(allArea);
////////////////////////////////////////////////////////////////////////////////////	
		count = 0;
		reg1.setRegCenter(tow2, count);
		
		count = 1;
		reg2.setRegCenter(tow4, count);
		
		view.printRegCenter(reg1);
		view.printRegCenter(reg2);
		
		
	}

}
