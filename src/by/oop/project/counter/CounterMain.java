package by.oop.project.counter;

public class CounterMain {

	public static void main(String[] args) {
		CounterLogic log = new CounterLogic();
		CounterView view = new CounterView();
		Counter counter = new Counter(5, true, 0, 100);
		
		int add = 15;
		int minus = 6;
		
		counter.setPresentValue(log.counterPlus(counter, add));
		counter.setPresentValue(log.counterMinus(counter, minus));
		view.counter(counter);
		
		add = 5;
		minus = 1;
		
		counter.setStatus(log.stateChange(counter));
		counter.setPresentValue(log.counterPlus(counter, add));
		counter.setPresentValue(log.counterMinus(counter, minus));
		
		view.counter(counter);
	}

}
