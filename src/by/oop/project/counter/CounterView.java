package by.oop.project.counter;

public class CounterView {
	public void printErrorMessaage() {
		System.out.println("Value out of counter, value is not changed");
	}
	public void printCounteOff() {
		System.out.println("Counter OFF");
	}
	public void counter(Counter c) {
		System.out.println("Present value: " + c.getPresentValue() + "| Status: " + c.isStatus() + "| Value FROM: " + c.getFrom() + "| Value TO: " + c.getTo()); 
	}
}