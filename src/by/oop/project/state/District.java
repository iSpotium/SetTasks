package by.oop.project.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
	private List<Town> district;

	public District() {
		district = new ArrayList<>();
	}

	public District(List<Town> district) {
		this.district = new ArrayList<Town>();
		this.district.addAll(district);
	}

	public List<Town> getDistrict() {
		return district;
	}

	public void setDistrict(List<Town> district) {
		this.district = district;
	}

	public boolean add(Town town) {
		district.add(town);
		return true;
	}

	public boolean add(int index, Town town) {
		if (index < 0 || index > district.size()) {
			return false;
		}
		district.add(index, town);
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(district, other.district);
	}

}
