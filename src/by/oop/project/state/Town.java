package by.oop.project.state;

import java.util.Objects;

public class Town {
	private String name;
	private int population;
	private double area;

	public Town() {
		name = "";
		population = 0;
		area = 0.0;
	}

	public Town(String name, int population, double area) {
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, name, population);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) && Objects.equals(name, other.name)
				&& population == other.population;
	}

	@Override
	public String toString() {
		return "Town [name=" + name + ", population=" + population + ", area=" + area + "]";
	}

}
