package by.oop.project.state;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private List<District> region;
	private Town regCenter;

	public Region() {
		region = new ArrayList<District>();
	}

	public Region(List<District> district) {
		region = new ArrayList<District>();
		region.addAll(district);
	}

	public boolean add(District district) {
		region.add(district);
		return true;
	}

	public List<District> getRegion() {
		return region;
	}

	public void setRegion(List<District> region) {
		this.region = region;
	}

	public Town getRegCenter() {
		return regCenter;
	}

	public void setRegCenter(List<Town> town, int count) {
		Town t = town.get(count);
		this.regCenter = t;
	}

}
