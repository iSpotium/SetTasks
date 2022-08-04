package by.oop.project.triangle;

import java.util.Arrays;
import java.util.Objects;

public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;
	private double square;
	private double perimetr;

	public Triangle() {
		sideA = 0;
		sideB = 0;
		sideC = 0;
		square = 0;
		perimetr = 0;

	}

	public Triangle(double sideA, double sideB, double sideC, double square, double perimetr) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.square = square;
		this.perimetr = perimetr;
	}


	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public void setPerimetr(double perimetr) {
		this.perimetr = perimetr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(perimetr, sideA, sideB, sideC, square);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Double.doubleToLongBits(perimetr) == Double.doubleToLongBits(other.perimetr)
				&& Double.doubleToLongBits(sideA) == Double.doubleToLongBits(other.sideA)
				&& Double.doubleToLongBits(sideB) == Double.doubleToLongBits(other.sideB)
				&& Double.doubleToLongBits(sideC) == Double.doubleToLongBits(other.sideC)
				&& Double.doubleToLongBits(square) == Double.doubleToLongBits(other.square);
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", square=" + square
				+ ", perimetr=" + perimetr + "]";
	}

}