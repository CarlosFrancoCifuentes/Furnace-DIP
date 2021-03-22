package main.java.edu.pingpong.furnace.hardware;

import main.java.edu.pingpong.furnace.types.RoomTemperature;
import main.java.edu.pingpong.furnace.interfaces.Heater;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}