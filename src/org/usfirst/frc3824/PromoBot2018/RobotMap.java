// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3824.PromoBot2018;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController chassisTopLeftMotor;
    public static SpeedController chassisMidLeftMotor;
    public static SpeedController chassisBotLeftMotor;
    public static SpeedControllerGroup chassisLeftDrive;
    public static SpeedController chassisTopRightMotor;
    public static SpeedController chassisMidRightMotor;
    public static SpeedController chassisBotRightMotor;
    public static SpeedControllerGroup chassisRightDrive;
    public static DifferentialDrive chassisDifferentialDrive;
    public static Compressor chassisCompressor;
    public static Solenoid chassisTransmission;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static WPI_TalonSRX crossbowRotator;
	
	public static void init()
	{
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisTopLeftMotor = new VictorSP(0);
        LiveWindow.addActuator("Chassis", "TopLeftMotor", (VictorSP) chassisTopLeftMotor);
        chassisTopLeftMotor.setInverted(false);
        chassisMidLeftMotor = new VictorSP(1);
        LiveWindow.addActuator("Chassis", "MidLeftMotor", (VictorSP) chassisMidLeftMotor);
        chassisMidLeftMotor.setInverted(false);
        chassisBotLeftMotor = new VictorSP(2);
        LiveWindow.addActuator("Chassis", "BotLeftMotor", (VictorSP) chassisBotLeftMotor);
        chassisBotLeftMotor.setInverted(false);
        chassisLeftDrive = new SpeedControllerGroup(chassisTopLeftMotor, chassisMidLeftMotor , chassisBotLeftMotor );
        LiveWindow.addActuator("Chassis", "LeftDrive", chassisLeftDrive);
        
        chassisTopRightMotor = new VictorSP(3);
        LiveWindow.addActuator("Chassis", "TopRightMotor", (VictorSP) chassisTopRightMotor);
        chassisTopRightMotor.setInverted(false);
        chassisMidRightMotor = new VictorSP(4);
        LiveWindow.addActuator("Chassis", "MidRightMotor", (VictorSP) chassisMidRightMotor);
        chassisMidRightMotor.setInverted(false);
        chassisBotRightMotor = new VictorSP(5);
        LiveWindow.addActuator("Chassis", "BotRightMotor", (VictorSP) chassisBotRightMotor);
        chassisBotRightMotor.setInverted(false);
        chassisRightDrive = new SpeedControllerGroup(chassisTopRightMotor, chassisMidRightMotor , chassisBotRightMotor );
        LiveWindow.addActuator("Chassis", "RightDrive", chassisRightDrive);
        
        chassisDifferentialDrive = new DifferentialDrive(chassisLeftDrive, chassisRightDrive);
        LiveWindow.addActuator("Chassis", "DifferentialDrive", chassisDifferentialDrive);
        chassisDifferentialDrive.setSafetyEnabled(true);
        chassisDifferentialDrive.setExpiration(0.1);
        chassisDifferentialDrive.setMaxOutput(1.0);

        chassisCompressor = new Compressor(0);
        LiveWindow.addActuator("Chassis", "Compressor", chassisCompressor);
        
        chassisTransmission = new Solenoid(0, 0);
        LiveWindow.addActuator("Chassis", "Transmission", chassisTransmission);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        crossbowRotator = new WPI_TalonSRX(1);
	}
}
