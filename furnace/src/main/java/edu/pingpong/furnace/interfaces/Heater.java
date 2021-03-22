import main.java.edu.pingpong.furnace.interfaces;

import main.java.edu.pingpong.furnace.types.RoomTemperature;

public interface Heater {
    public void engage(RoomTemperature temperature);
	public void disengage(RoomTemperature temperature);
}
