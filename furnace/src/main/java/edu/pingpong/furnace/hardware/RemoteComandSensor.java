package main.java.edu.pingpong.furnace.hardware;

import main.java.edu.pingpong.furnace.types.RoomTemperature;
import main.java.edu.pingpong.furnace.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}