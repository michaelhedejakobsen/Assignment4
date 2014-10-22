/**
 * Room class creates 3 new instances of the class Room, gives values to the variables, and prints it.
 * @author Michael H. Jakobsen
 * Oct. 21, 2014
 *
 */
public class RoomDriver {

	public static void main(String[] args) {
		/**
		 * Creates new instance of class Room, gives values to variables, and prints to println
		 */
		Room BedRoom = new Room("yellow", "hard wood", 1);
		System.out.println(BedRoom);
		
		/**
		 * Creates new instance of class Room, gives values to variables, and prints to println
		 */
		Room Kitchen = new Room("purple", "tile", 0);
		System.out.println(Kitchen);
		
		/**
		 * Creates new instance of class Room, gives values to variables, and prints to println
		 */
		Room LivingRoom = new Room("white", "carpet", 3);
		System.out.println(LivingRoom);

	}

}
