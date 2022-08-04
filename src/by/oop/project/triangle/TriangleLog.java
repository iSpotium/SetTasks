package by.oop.project.triangle;

public class TriangleLog {

	public double perimeter(Triangle triangle) {
		double perimetr;

		perimetr = triangle.getSideA() + triangle.getSideB() + triangle.getSideC();

		return perimetr;
	}

	public double square(Triangle t) {

		double squ;
		
		squ = (t.getSideA() * t.getSideB()) * 1 / 2 ;
		
		return squ;
	}
}
