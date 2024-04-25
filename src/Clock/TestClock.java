package Clock;

public class TestClock {

	public static void main(String[] args) {
		Clock clock1 = new Clock(14,40);
		
		clock1.display();
		clock1.increaseTime(10);
		clock1.display();
		clock1.increaseTime(25);
		clock1.display();
		clock1.increaseTime(245);
		clock1.display();

	}

}
