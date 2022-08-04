package by.oop.project.triangle;

public class TriangleMain {

	public static void main(String[] args) {

		Triangle trg = new Triangle(12, 4, 8, 0 , 0);
		
		TriangleLog log = new TriangleLog();
	
		trg.setPerimetr(log.perimeter(trg));
		trg.setSquare(log.square(trg));
		
		TriangleView view = new TriangleView();
		
		view.printTriangle(trg);
		
	}
}
