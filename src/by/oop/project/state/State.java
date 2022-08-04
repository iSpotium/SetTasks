package by.oop.project.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
	private List<Region> state;
	private Town Capital;

	public State() {
		state = new ArrayList<Region>();
	}

	public State(List<Region> region) {
		state = new ArrayList<Region>();
		state.addAll(region);
	}

	public boolean add(Region region) {
		state.add(region);
		return true;
	}

	public List<Region> getState() {
		return state;
	}

	public void setState(List<Region> state) {
		this.state = state;
	}

	public Town getCapital() {
		return Capital;
	}

	public void setCapital(List<Town> town, int count) {
		Town tow = town.get(count);
		Capital = tow;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Capital, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(Capital, other.Capital) && Objects.equals(state, other.state);
	}

}
