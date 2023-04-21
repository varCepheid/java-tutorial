public class KInterfaces {
	public static interface Vehicle {
		public void start();

		public void move(int speed);

		public int displaySpeed();
	}

	public static class Car implements Vehicle {
		boolean keyTurned;
		int speed;

		CarSettings running = CarSettings.OFF;
		int position = 0;

		public Car(int startingSpeed) {
			keyTurned = false;
			speed = startingSpeed;
		}

		public void start() {
			this.keyTurned = true;
			print("Car has started!");
			this.running = CarSettings.RUNNING;
		}

		public void move(int newSpeed) {
			if (this.running == CarSettings.OFF) {
				this.start();
			}
			position += speed;
			speed = newSpeed;
		}

		public int displaySpeed() {
			return speed;
		}

		public void halfStart() {
			this.keyTurned = false;
			this.running = CarSettings.ELECTRICITY_ONLY;
		}

		public enum CarSettings {
			RUNNING, ELECTRICITY_ONLY, OFF
		}
	}

	public static void main() {
		Car myCar = new Car(30);
		myCar.start(); // "Car has started!"
		myCar.move(myCar.speed);
		print(myCar.displaySpeed()); // 30

		Vehicle car = new Vehicle();

		myCar.halfStart();
		print(myCar.keyTurned); // false
	}
}
