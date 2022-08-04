package by.oop.project.counter;

public class Counter {
	private int presentValue;
	private boolean status;
	private int from;
	private int to;

	CounterView view = new CounterView();
	
	public Counter() {
		presentValue = 0;
		status = false;
		from = 0;
		to = 0;
	}

	public Counter(int presentvalue, boolean status, int from, int to) {
		if((presentValue < 0) || (presentValue > 100)){
				this.presentValue = 0;
			}else {
				this.presentValue = presentvalue;
			}
		
		
		this.status = status;

		if ((from < 0) || (from > 0)) {
			this.from = 0;
		} else {
			this.from = from;
		}

		if ((to < 100) || (to > 100)) {
			this.to = 100;
		} else {
			this.to = to;
		}

	}

	public int getPresentValue() {
		return presentValue;
	}

	public void setPresentValue(int presentValue) {
		int temp = this.presentValue;
		
		if((presentValue > 99) || ( presentValue < 0)){
			this.presentValue = temp; 
			view.printErrorMessaage();
		}else {
			this.presentValue = presentValue;
		}
		
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Counter [presentValue=" + presentValue + ", status=" + status + ", from=" + from + ", to=" + to + "]";
	}

}