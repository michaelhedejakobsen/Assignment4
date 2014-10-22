/**
 * Room class is a class that describes a room with color of walls, type of floor, and amount of windows.
 * The class has a constructor that holds no parameters, and an overloaded constructor that holds all attributes.
 * The class has set and get for all three attributes.
 * Finally there is a method to list the room with all the set attributes to a string, using get for the input.
 * @author Michael H. Jakobsen
 * Oct. 21, 2014
 *
 */
public class Room {
		/**
		 * Initializing variables for wallColor, floor, and windows.
		 */
		private String wallColor = "white";
		private String floor = "carpet";
		private int windows = 0;
		
		/**
		 * Constructs a new room that holds wall_color = "Green", floor = "Hard wood", and windows = 5
		 */
		public Room() {
			
		}
		
		/**
		 * Constructs a new Room that holds color, floor type and number of windows based on the arguments
		 * @param Color
		 * @param floorType
		 * @param noOfWindows
		 */
		public Room(String Color, String floorType, int noOfWindows) {
			this.wallColor = Color;
			this.floor = floorType;
			this.windows = noOfWindows;	
		}

		/**
		 * Gets wall color
		 * @return Color
		 */
		public String getWallColor() {
			return wallColor;
		}

		/**
		 * Sets the wall color
		 * @param colour
		 */
		public void setWallColor(String color){
			
			this.wallColor = color;
		}
		
		/**
		 * Gets the floor type
		 * @return floor
		 */
		public String getFloor() {
			return floor;
		}

		/**
		 * Sets the floor type
		 * @param floorType
		 */
		public void setFloor(String floorType){
			
			this.floor = floorType;
		}
		
		/**
		 * Gets the number of windows
		 * @return noOfWindows
		 */
		public int getWindows() {
			return windows;
		}

		/**
		 * Sets number of windows
		 * @param noOfWindows
		 */
		public void setNoOfWindows (int noOfWindows){
			
			this.windows = noOfWindows;
		}

		/* *
		 * Gets wall color, floor type and number of windows 
		 * @return the Person attributes
		 */
		@Override
		public String toString() {
			return "The new room has these attributes: Wall color = " + getWallColor() + ", Floor type = " + getFloor()
					+ ", Number of windows = " + getWindows();
		

	}
		
}