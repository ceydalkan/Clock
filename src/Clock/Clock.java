package Clock;

public class Clock {
	private int hour;
	private int minute;
	
	public Clock(int hour, int min) {
		if (hour <= 24)
			this.hour = hour;
		else 
			this.hour = hour % 24;
		
		this.minute = min;
}	
	
	public void setHour(int hour) {
		this.hour = hour;
}
	
	public void setMin(int min) {
		this.minute = min;
}
	
	public int getHour() {
		return hour;
}
	
	public int getMin() {
		return minute;
}
	
	public void display() {
		System.out.print(hour<10 ? "0" + hour + ":" : hour + ":");
		System.out.println(minute<10 ? "0" + minute : minute);
}	
	
	public void increaseTime(int add) {
		minute = this.minute+add;
		
		if (minute >= 60) {
			this.hour += minute / 60;
			this.minute = minute % 60;
	}
}
}












