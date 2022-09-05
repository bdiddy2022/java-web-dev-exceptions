package org.launchcode.Temperature;
//1) Any **customized** exception must inherit from Java's built-in 'Exception' class
public class TemperatureException extends Exception {
    // Write code here!
	//2)Build the constructor (Do not want other classes to call the Exception class directly, they will use this class as a reference to it instead
			//Really, this entire class is about "sending a message" (aka creating the message that will log to the console if an exception is thrown, which preexists within 'Exception')
	public TemperatureException(String message){
		super(message);
	}

}
