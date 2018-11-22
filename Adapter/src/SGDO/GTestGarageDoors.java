package SGDO;

public class GTestGarageDoors {

	public static void main(String[] args) {
//		BasicGarageDoor[] doors = {
//				new GarageDoorAdapter(5),
//				new GarageDoorApp(new StdGarageDoorOpener());
//		};
		
		GarageDoorAdapter adapter = new GarageDoorAdapter(5);
//		adapter.openDoor();
		
		GarageDoorApp basicGarageDoor = new GarageDoorApp(adapter);
		
		basicGarageDoor.openDoor();

	}

}
