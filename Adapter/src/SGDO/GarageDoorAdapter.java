package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener {
	
	private int speed;
	PremiumGarageDoorOpener garageDoor;
	
	public GarageDoorAdapter(int speed) {
		garageDoor = new PremiumGarageDoorOpener();
		this.speed = speed;
	}

	@Override
	public void openDoor() {
		garageDoor.openDoor(this.speed);
		
	}

	@Override
	public void closeDoor() {
		garageDoor.closeDoor(this.speed);
		
	}

}
