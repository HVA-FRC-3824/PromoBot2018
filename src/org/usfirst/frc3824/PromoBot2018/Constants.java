package org.usfirst.frc3824.PromoBot2018;

public class Constants
{
	// *****************************************************************************************************
	// Crossbow rotator constants
	// *****************************************************************************************************
	
	public static int TALON_INITIAL_COMMUNICATION_TIMEOUT = 10;
	
	// *****************************************************************************************************
	// Crossbow rotator constants
	// *****************************************************************************************************
	
	public static double CROSSBOW_ROTATOR_PID_F = 2.0;
	public static double CROSSBOW_ROTATOR_PID_P = 3.0;
	public static double CROSSBOW_ROTATOR_PID_I = 0.0;
	public static double CROSSBOW_ROTATOR_PID_D = 0.0;
	
	public static double CROSSBOW_ROTATOR_PID_MAX = 1.0;
	public static double CROSSBOW_ROTATOR_PID_MIN = -1.0;
	
	public static int CROSSBOW_ROTATOR_CRUISE_VELOCITY = 1000;
	public static int CROSSBOW_ROTATOR_ACCELERATION = 2000;
	
	public static double CROSSBOW_ROTATOR_ENCODER_TO_ANGLE_Y_INT = 9000.0;
	
	public static double CROSSBOW_ROTATOR_MIN_ANGLE = 80.0;
	public static double CROSSBOW_ROTATOR_MAX_ANGLE = -18.0;
}
